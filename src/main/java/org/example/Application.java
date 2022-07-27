package org.example;

//import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("org.example.mapper")
@EnableDiscoveryClient

//@NacosPropertySource(dataId = "example", autoRefreshed = true)

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}