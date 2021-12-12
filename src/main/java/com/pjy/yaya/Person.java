package com.pjy.yaya;
import org.springframework.web.bind.annotation.*;

@RestController
public class Person<name> {
    static String name;
    @GetMapping
    public static String Greetings(){
        return "Student name is : "+name;
    }

    @PostMapping("/hello")
    public static String hello(@RequestParam("name") String name,
                        @RequestParam("age") Integer age) {
        return "name：" + name + "\nage：" + age;
    }

}
