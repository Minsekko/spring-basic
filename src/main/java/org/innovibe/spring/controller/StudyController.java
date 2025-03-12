package org.innovibe.spring.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/study")
public class StudyController {
    @RequestMapping("/one")
    public void studyOneHandle(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {
        HttpSession s = req.getSession();
        System.out.println(s == session);
    }

    @RequestMapping("/two")
    public String studyToHandle(Model model) {
        System.out.println("studyToHandle");
        model.addAttribute("msg", "Hello Spring");

        return "study/two";
    }

    /*
        @RequestParam : 특정 파라미터를 바로 추출하고자 할때
     */
    @RequestMapping("/three")
    public void studyThreeHandle(@RequestParam("code") String code, @RequestParam("size") int size) {
        System.out.println("studyThreeController");
        System.out.println("code=" + code);
        System.out.println("size=" + size);
    }


}
