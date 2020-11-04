package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {



    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @ResponseBody
    public String getExpressRouteList() {
        log.info("testService.sayHello()");
        return "testService.sayHello()";
    }
}
