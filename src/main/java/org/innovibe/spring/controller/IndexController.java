package org.innovibe.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
    RequestMappingHandelrMapping 을 쓰게 되면 HttpRequestHandler 라는 interface 를 토대로 만들면 안됨.
 */

@Controller
public class IndexController {

    @RequestMapping({"/","/index"})
    public void indexHandler() {
        System.out.println("IndexHandler.index");
    }

    @RequestMapping("/help")
    public void helpHandler() {
        System.out.println("IndexHandler.help");
    }

    @RequestMapping("/help-faher")
    public void helpHandler2() {
        System.out.println("IndexHandler.help-faher");
    }

}
