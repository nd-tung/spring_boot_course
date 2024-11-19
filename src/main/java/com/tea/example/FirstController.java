package com.tea.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    //@GetMapping("/hello")
    public String sayHello() {
        return "Hello from my first controller!";
    }

    @PostMapping("/post")
    public String post(@RequestBody String message){
        return "Post request received!, the message is: " + message;
    }

    @PostMapping("/post-order")
    public String post(@RequestBody Order order){
        return "Post request received!, the order is: " + order.toString();
    }

    @PostMapping("/post-order-record")
    public String post(@RequestBody OrderRecord order){
        return "Post request received!, the order is: " + order.toString();
    }

    //localhost:8080/hello/user-name
    //@GetMapping("/hello/{user-name}")
    public String pathVar(
           @PathVariable("user-name") String userName
    ) {
        return "Hello " + userName;
    }

    //localhost:8080/hello?param_name=value&param_name=value
    @GetMapping("/hello")
    public String paramVar(
            @RequestParam("user-name") String userName,
            @RequestParam("user-last-name") String userLastName
    ) {
        return "Hello " + userName + " " + userLastName;
    }
}
