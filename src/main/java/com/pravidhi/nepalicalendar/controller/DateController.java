package com.pravidhi.nepalicalendar.controller;

import com.pravidhi.nepalicalendar.service.DateConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DateController {
    private static final Logger logger = LoggerFactory.getLogger(DateController.class);

    @Autowired
    private DateConverter converter;

    @GetMapping("/")
    public String index(Model model) {
        getOptions(model);
        return "index";
    }

    @PostMapping("/")
    public String index(Model model,
                        @RequestParam String year,
                        @RequestParam String month,
                        @RequestParam String day) throws Exception {
        getOptions(model);
        boolean isValid = validateInput(model, year, month, day);

        if (isValid) {
            String bs = converter.adToBS(year + "-" + month + "-" + day);
            model.addAttribute("bs", bs);
            model.addAttribute("adDate", year + "-" + month + "-" + day);
            logger.info("Nepali Date, " + bs);
        }
        return "index";
    }

    private boolean validateInput(Model model, String year, String month, String day) {
        if (year.isEmpty() || month.isEmpty() || day.isEmpty()) {
            model.addAttribute("errorMessage", "All fields are required. Please provide year, month and day!");
            return false;
        }
        return true;
    }

    private List<String> getOptions(Model model) {
        model.addAttribute("years", generateOptions(1970, 2100));
        model.addAttribute("months", generateOptions(1, 12));
        model.addAttribute("days", generateOptions(1, 32));
        return generateOptions(1, 12);
    }

    private List<String> generateOptions(Integer start, Integer end) {
        List<String> options = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            options.add(String.format("%02d", i));
        }
        return options;
    }
}
