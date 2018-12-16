package liu.hope.malloa.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import liu.hope.entity.Notice;
import liu.hope.service.INoticeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author Hope
 * @version 1.0
 * TODO:
 * @createTime 2018/12/15 21:25
 */
@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Reference
    private INoticeService noticeService;

    @Resource
    private FastFileStorageClient fastFileStorageClient;

    @Value("${image.path}")
    private String path;

    @GetMapping("/selectById")
    public String selectById(@RequestParam("id") Integer id, Model model){
        Notice notice = noticeService.selectById(id);
        model.addAttribute("notice",notice);
        model.addAttribute("path",path);
        return "/notice/one";
    }

    @GetMapping("/insert")
    public String insert(){
        return "/notice/insert";
    }

    @PostMapping("/insert")
    @ResponseBody
    public Notice insert(Notice notice, @RequestParam("file") MultipartFile file){
        StorePath storePath = null;
        try {
            storePath = fastFileStorageClient.uploadFile(file.getInputStream(), file.getSize(), "JPG", null);
            String fullPath = storePath.getFullPath();
            notice.setImg(fullPath);
            notice = noticeService.insert(notice);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return notice;
    }
}
