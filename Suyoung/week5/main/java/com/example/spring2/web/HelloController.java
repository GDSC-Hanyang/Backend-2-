package com.example.spring2.web;

import com.example.spring2.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("_name") String name,
                                     @RequestParam("_amount") int amount) {

        return new HelloResponseDto(name, amount);
    }

}
