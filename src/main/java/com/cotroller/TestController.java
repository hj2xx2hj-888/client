package com.cotroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/test"})
public class TestController {



    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @ResponseBody
    public String getExpressRouteList() {
        return "testService.sayHello()";
    }
}
