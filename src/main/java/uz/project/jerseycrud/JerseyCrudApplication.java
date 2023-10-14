package uz.project.jerseycrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "uz.project.jerseycrud")
public class JerseyCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(JerseyCrudApplication.class, args);
    }

}
