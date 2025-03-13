package org.innovibe.spring.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.innovibe.spring.model.TableBooking;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/booking")
public class BookingController {
    @RequestMapping("/form")
    public String bookingFormHandle() {
        return "/booking/form";
    }

    @RequestMapping("/proceed")
    public String bookingProceedHandle(@ModelAttribute @Valid TableBooking booking, BindingResult result,
                                       Model model, HttpSession httpSession) {
        System.out.println("booking proceed handle");
        System.out.println("booking: " + booking);
        System.out.println("Error = " + result.hasErrors());

        String uuid = UUID.randomUUID().toString();

        model.addAttribute("uuid",uuid);

        if(!result.hasErrors()) {
            return "/booking/proceed";
        } else {
            FieldError customerNameError = result.getFieldError("customerName");
            System.out.println("customerNameError = " + customerNameError);
            model.addAttribute("customerNameError", result.getFieldError("customerName"));

            int guestErrorCount = result.getFieldErrorCount("guests");
            System.out.println("guestErrorCount = " + guestErrorCount);
            model.addAttribute("guestErrorCount", result.getFieldError("guests"));

            return "/booking/proceed-error";
        }
    }
}
