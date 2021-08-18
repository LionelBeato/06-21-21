package com.tts.weatherapp.controller;

import com.tts.weatherapp.model.Response;
import com.tts.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public String getIndex(Model model) {
        Response response = weatherService.getForecast("43210");
        model.addAttribute("data", response);
        return "index";
    }


}
