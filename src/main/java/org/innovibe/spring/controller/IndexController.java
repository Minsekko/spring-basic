package org.innovibe.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*
    RequestMappingHandelrMapping 을 쓰게 되면 HttpRequestHandler 라는 interface 를 토대로 만들면 안됨.
 */

@Controller
public class IndexController {

    @RequestMapping({"/","/index"})
    public ModelAndView indexHandler() {

        System.out.println("IndexHandler.index");
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("msg", "Hello World");

        return mav;
    }

    @RequestMapping("help")
    public String helpHandle() {
        System.out.println("IndexHandler.help");
        return  "help";
    }

}
