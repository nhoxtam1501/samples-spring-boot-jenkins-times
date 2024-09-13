package dev.ducku.jenkinssamples3th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsSamples3thApplication {

    @GetMapping("/demo")
    public String demo() {
        return "Hello Jenkins 3th times";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSamples3thApplication.class, args);
    }

}
