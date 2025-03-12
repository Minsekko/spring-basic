package org.innovibe.spring.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.innovibe.spring.model.TravelSchecule;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

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

    @RequestMapping("/four")
    public void studyFourHandle(@RequestParam("titleId") int titleId,
                                @RequestParam("keyword") @Nullable String sort,
                                @RequestParam("page") @Nullable Integer page) {
        System.out.println("studyFourController.studyFourHandle()");

        sort = (sort == null) ? "DESC" : sort;
        page = (page == null) ? 1 :page;

        System.out.println("sort=" + sort);
        System.out.println("page=" + page);
    }

    @RequestMapping("/five")
    public void studyFiveHandle(@RequestParam("titleId") int titleId,
                                @RequestParam("sort") Optional<String> sort,
                                @RequestParam("page") Optional<Integer> page) {
        System.out.println("studyFiveController.studyFiveHandle()");

        //String sortValue = sort.isPresent() ? sort.get() : "DESC";
        Integer pageValue = page.orElse(1);
        String sortValue = sort.orElse("DESC");

        System.out.println("sortValue = " + sortValue);
        System.out.println("pageValue = " + pageValue);
    }

    /*
        @ModelAttribute :

        ModelAttribute 로 받을때 할수 있는 아주 효율적인 기능이 하나 더 있다.
     */
    @RequestMapping("/six")
    public void studySixHandle(@ModelAttribute TravelSchecule schecdule) {
        System.out.println("studyController.studySixHandel()");
        System.out.println(schecdule.toString() );
    }

    /*
        @RequestMapping methods can be mapped using URL patterns.

        @PathVariable
     */
    @RequestMapping("/seven/{subject}")
    public void studySevenHandle(@PathVariable("subject") String subject) {
        System.out.println("StudyController.studySevenHandle");
        System.out.println("subject =" + subject);
    }

}
