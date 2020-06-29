package com.pravidhi.nepalicalendar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController {
    private static final Logger logger = LoggerFactory.getLogger(DateController.class);

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
