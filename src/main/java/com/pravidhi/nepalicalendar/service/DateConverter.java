package com.pravidhi.nepalicalendar.service;

import com.pravidhi.nepalicalendar.util.DateLookup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Map;

import static java.time.temporal.ChronoUnit.DAYS;

@Component
public class DateConverter {
    private static final Logger logger = LoggerFactory.getLogger(DateConverter.class);

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private Map<Integer, Integer[]> newYearDays = DateLookup.newYearDays;

    public String adToBS(String adDate) throws Exception {
        logger.info("English Date, " + adDate);
        LocalDate inputDate = LocalDate.parse(adDate, formatter);
        int adYear = inputDate.getYear();
        LocalDate newYearDate = getNewYearDate(adYear);
        int bsMonth = 1;

        int bsYear = newYearDate.isBefore(inputDate) ? adYear + 57 : adYear + 56;
        long difference = DAYS.between(newYearDate, inputDate) + 1;
        long bsDay = difference < 0 ? difference + 365 : difference;

        for (Byte monthDays : DateLookup.daysInMonth.get(bsYear)) {
            if (bsDay > monthDays) {
                bsMonth++;
                bsDay -= monthDays;
            }
        }
        return toNepali(bsYear) + " साल " + DateLookup.monthOfYear[bsMonth - 1] + " " + toNepali((int) bsDay)
                + " गते " + DateLookup.dayOfWeek[inputDate.getDayOfWeek().getValue() - 1];
    }

    private String toNepali(int num) {
        StringBuilder sb = new StringBuilder();
        for (String c : (String.valueOf(num)).split("")) {
            sb.append(DateLookup.nepaliNum[Integer.parseInt(c)]);
        }
        return sb.toString();
    }

    private LocalDate getNewYearDate(int adYear) throws Exception {
        for (Integer key : newYearDays.keySet()) {
            if (Arrays.asList(newYearDays.get(key)).contains(adYear)) {
                return LocalDate.parse(adYear + "-04-" + key, formatter);
            }
        }
        throw new Exception("Unsupported Year");
    }
}
