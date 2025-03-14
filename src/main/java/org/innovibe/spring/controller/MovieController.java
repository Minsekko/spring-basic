package org.innovibe.spring.controller;

import org.innovibe.spring.model.Movie;
import org.innovibe.spring.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping("/form")
    public String movieFormHandle() {
        return "/movie/form";
    }

    @RequestMapping("/create-proceed")
    public String createProceedHandle(@ModelAttribute Movie movie) {
        boolean result = movieRepository.create(movie);
        System.out.println("create = " + result);
        return "movie/create-proceed";
    }
}
