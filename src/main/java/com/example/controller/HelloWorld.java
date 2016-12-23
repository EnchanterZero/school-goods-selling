package com.example.controller;

import com.example.pojo.User;
import com.example.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.log4j.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    protected Logger logger = Logger.getLogger(HelloWorld.class);

    //this way leads to a jsp file named "HelloWorld";
    @RequestMapping("/world")
    public String toHelloWorld(HttpServletRequest request, Model model){
        //在后台输出
        logger.debug("******************  hello/world");
        int id = Integer.parseInt(request.getParameter("id"));
        User u = this.helloWorldService.getUserById(id);
        model.addAttribute("user",u);
        return "HelloWorld";
    }

    //restful
    @ResponseBody
    @RequestMapping(value = "/rest/{id}",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String totest(HttpServletRequest request, @PathVariable String id){
        //在后台输出

        logger.debug("******************  hello/rest");
        return "{ \"message\" : \"hello,"+id+" restful api\" }";
    }

}
