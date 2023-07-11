package top.hugo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableFeignClients(basePackages = {"top.hugo.client.feign"})
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ClientApplication.class);
        application.run(args);
    }
}