package com.example.controller;

import com.example.pojo.User;
import com.example.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.log4j.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by intern07 on 16/12/22.
 */
@Controller
@RequestMapping("/hello")
public class HelloWorld {
    @Resource
    private HelloWorldService helloWorldService;

    @RequestMapping("/world")
    public String toIndex(HttpServletRequest request, Model model){
        PropertyConfigurator.configure("log4j.properties");
        //在后台输出
        Logger logger = Logger.getLogger("console");
        logger.debug("******************  hello-------world");
        int id = Integer.parseInt(request.getParameter("id"));
        User u = this.helloWorldService.getUserById(id);
        model.addAttribute("user",u);
        return "HelloWorld";
    }
}
