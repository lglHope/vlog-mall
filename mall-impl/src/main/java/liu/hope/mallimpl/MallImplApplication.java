package liu.hope.mallimpl;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("liu.hope.mallimpl.impl")
@MapperScan("liu.hope.mapper")
public class MallImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallImplApplication.class, args);
    }

}

