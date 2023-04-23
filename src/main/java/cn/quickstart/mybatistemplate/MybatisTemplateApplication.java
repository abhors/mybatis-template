package cn.quickstart.mybatistemplate;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan(basePackages = "cn.quickstart.mybatistemplate.**.dao")
@Import(value = {PaginationInnerInterceptor.class})
public class MybatisTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisTemplateApplication.class, args);
    }

}
