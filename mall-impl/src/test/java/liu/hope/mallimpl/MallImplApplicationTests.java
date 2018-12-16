package liu.hope.mallimpl;

import liu.hope.mapper.NoticeMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallImplApplicationTests {

    @Resource
    private NoticeMapper noticeMapper;

    @Test
    public void contextLoads() {
        noticeMapper.selectById(2);
    }

}

