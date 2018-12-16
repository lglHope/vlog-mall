package liu.hope.mallimpl.impl;

import com.alibaba.dubbo.config.annotation.Service;
import liu.hope.entity.Notice;
import liu.hope.mapper.NoticeMapper;
import liu.hope.service.INoticeService;

import javax.annotation.Resource;

/**
 * @author Hope
 * @version 1.0
 * TODO:
 * @createTime 2018/12/15 21:11
 */
@Service(interfaceClass = INoticeService.class)
public class NoticeServiceImpl implements INoticeService {

    @Resource
    private NoticeMapper noticeMapper;


    @Override
    public Notice selectById(Integer id) {
        return noticeMapper.selectById(id);
    }

    @Override
    public Notice insert(Notice notice) {
        noticeMapper.insert(notice);
        return notice;
    }
}
