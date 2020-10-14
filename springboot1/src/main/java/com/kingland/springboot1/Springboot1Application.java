
package com.kingland.springboot1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springboot1Application {
    @Value("${dd.dd}")
    private  String a;

    public static void main(String[] args) {
        SpringApplication.run(Springboot1Application.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s %s!", name, a);
    }
    @GetMapping("/hello2")
    public String hello2(@RequestParam(value = "name", defaultValue = "World") String name,
                    @RequestParam(value = "age", defaultValue = "World") String age) {
        return String.format("Hello, %s %s!", name,age);
    }
}