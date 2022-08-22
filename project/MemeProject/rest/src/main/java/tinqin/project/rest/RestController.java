package tinqin.project.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "tinqin.project")
@EnableFeignClients(basePackages = "tinqin.project")
public class RestController {
    public static void main(String[] args) {SpringApplication.run(RestController.class, args);}

}
