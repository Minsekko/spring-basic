package org.innovibe.spring.controller;

import org.innovibe.spring.model.TravelModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/travel")
public class TravelResultController {
    @RequestMapping("/form")
    public String formHandle() {
        return "travel/form";
    }

    @RequestMapping("/result")
    public void travelHandle(@ModelAttribute TravelModel travel, Model model) {
        int stayCost = travel.getStayCost();
        int transportationCost = travel.getTransportationCost();
        int foodCost = travel.getFoodCost();
        int additionalCosts = travel.getAdditionalCosts();

        int tempTotal = stayCost + transportationCost + foodCost + additionalCosts;  //숙박비 + 교통비 + 음식비+ 기타비용을 합산하여 total비용 계산
        int additionalTotal; //10% 가산 비용을 계산하기 위해 변수값 int로 지정
        if (travel.getDestination().equals("international")) {  // 목적지가 international 값과 같은지 확인하고 같으면 if 조건문을 진행한다
            additionalTotal = (int) (tempTotal * 0.1); // total 여행경비에 *0.1 금액을 계산 10% 추가금액을 계산 한다
        } else {
            additionalTotal = 0;  //if 조건에 해당되지 않으면 0원처리 한다
        }
        int costPerPerson = (tempTotal + additionalTotal) / travel.getHeadCount();  // 여행경비 + 해외 추기비용 / 인원 을 계산 하여 인원당 비용을 계산하여 처리한다

        model.addAttribute("tempTotal", tempTotal);
        model.addAttribute("additionalTotal", additionalTotal);
        model.addAttribute("costPerPerson", costPerPerson);
    }
}
