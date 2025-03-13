package org.innovibe.spring.controller;

import jakarta.validation.Valid;
import org.innovibe.spring.model.TravelSchedule;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study")
public class StudyExtraController {
    /*
        @ModelAttribute 로 데이터를 받을때 Spring은 재밌는 기능(데이터유효성 검사)을 제공한다.
        @Valid, @Validated
     */
    @RequestMapping("/eleven")
    public String oneHandel(@ModelAttribute @Valid TravelSchedule travelSchedule, BindingResult bindingResult) {

        System.out.println("StudyExtraController.oneHandle()");
        System.out.println(travelSchedule);
        boolean r = bindingResult.hasErrors();
        System.out.println("hasErrors = " + r);
        return "study/eleven";
    }
}
