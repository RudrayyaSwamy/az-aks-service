package org.matapathinextgentech.azaksservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class AzAksServiceApplication {

    @GetMapping
    public String welcome(){
        return "Welcome to the azure kubernates service.........";
    }

    public static void main(String[] args) {
        SpringApplication.run(AzAksServiceApplication.class, args);
    }

}
