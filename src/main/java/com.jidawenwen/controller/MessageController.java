package com.jidawenwen.controller;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
    @RequestMapping(path={"/message"},method = {RequestMethod.GET})
    public String message(){
        return "message";
    }
}
