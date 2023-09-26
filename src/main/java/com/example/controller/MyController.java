package com.example.controller;

import com.example.config.MyConfig;
import com.example.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    private MyService myService;
    private MyConfig myConfig;
    @Autowired
    public MyController(MyService myService, MyConfig myConfig) {
        this.myService = myService;
        this.myConfig = myConfig;
    }

@PostMapping

public String create(){
        return "test";
}



    @PutMapping

    public String update(){
        return "test";
    }


    @DeleteMapping

    public String delete(){
        return "test";
    }
@GetMapping("/test")
    public String get(){
        return "test2";
    }
    // RequestMapping은 handler가 뭘 봐~ 할때 본ㄴ 요소
}
