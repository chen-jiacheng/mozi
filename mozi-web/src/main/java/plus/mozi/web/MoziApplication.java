package plus.mozi.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by chenjiacheng on 2024/4/18 22:42
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@MapperScan("plus.mozi.data")
@EnableScheduling
@SpringBootApplication(scanBasePackages = "plus.mozi.*")
public class MoziApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoziApplication.class, args);
    }
}