package com.pravidhi.nepalicalendar.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class DateLookup {
    private static final Logger logger = LoggerFactory.getLogger(DateLookup.class);
    public static Map<Integer, Integer[]> newYearDays = new HashMap<>();
    public static Map<Integer, Byte[]> daysInMonth = new HashMap<>();
    public static String[] dayOfWeek;
    public static String[] monthOfYear;
    public static String[] nepaliNum;

    static {
        loadNepaliNumDayMonth();
        loadNewYearDays();
        loadDaysInMonth();
    }

    private static void loadNepaliNumDayMonth() {
        nepaliNum = new String[]{"०", "१", "२", "३", "४", "५", "६", "७", "८", "९"};
        dayOfWeek = new String[]{"सोमवार", "मंगलवार", "बुधवार", "बिहिवार", "शुक्रवार", "शनिवार", "आइतवार"};
        monthOfYear = new String[]{"बैशाख", "जेष्ठ", "आषाढ", "श्रावण", "भाद्र", "आश्विन", "कार्तिक", "मंसिर",
                "पौष", "माघ", "फाल्गुन", "चैत्र"};
        logger.info("Nepali numbers, days and months loaded");
    }

    private static void loadNewYearDays() {
        newYearDays.put(12, new Integer[]{1918});
        newYearDays.put(13, new Integer[]{1913, 1914, 1915, 1916, 1917, 1919, 1920, 1921, 1922, 1923, 1924, 1925, 1926, 1927, 1928,
                1929, 1930, 1931, 1932, 1933, 1934, 1935, 1936, 1937, 1938, 1939, 1940, 1941, 1942, 1944, 1945, 1946, 1948, 1949, 1950,
                1952, 1953, 1954, 1956, 1957, 1958, 1960, 1961, 1962, 1964, 1965, 1966, 1968, 1969, 1972, 1973, 1976, 1977, 1980, 1981,
                1984, 1985, 1988, 1989, 1992, 1993, 1996, 1997, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2035, 2040}); //73
        newYearDays.put(14, new Integer[]{1943, 1947, 1951, 1955, 1959, 1963, 1967, 1970, 1971, 1974, 1975, 1978, 1979, 1982,
                1983, 1986, 1987, 1990, 1991, 1994, 1995, 1998, 1999, 2001, 2002, 2003, 2005, 2006, 2007, 2009, 2010, 2011, 2013,
                2014, 2015, 2017, 2018, 2019, 2021, 2022, 2023, 2025, 2026, 2027, 2029, 2030, 2032, 2033, 2034, 2036, 2037, 2038,
                2041, 2042, 2043}); // 55
        newYearDays.put(15, new Integer[]{2031, 2039});
        logger.info("New Year Days loaded");
    }

    private static void loadDaysInMonth() {
        daysInMonth.put(1970, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1971, new Byte[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1972, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonth.put(1973, new Byte[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonth.put(1974, new Byte[]{31, 31, 32, 30, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1975, new Byte[]{31, 31, 32, 32, 30, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1976, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(1977, new Byte[]{30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31});
        daysInMonth.put(1978, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1979, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1980, new Byte[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(1981, new Byte[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonth.put(1982, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1983, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1984, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(1985, new Byte[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonth.put(1986, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1987, new Byte[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1988, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(1989, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1990, new Byte[]{30, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1991, new Byte[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1992, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 30});
        daysInMonth.put(1993, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1994, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1995, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1996, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1997, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1998, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(1999, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2000, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 29, 31});
        daysInMonth.put(2001, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2002, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2003, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2004, new Byte[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonth.put(2005, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2006, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2007, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2008, new Byte[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        daysInMonth.put(2009, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2010, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2011, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2012, new Byte[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonth.put(2013, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2014, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2015, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2016, new Byte[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonth.put(2017, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2018, new Byte[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2019, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonth.put(2020, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2021, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2022, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonth.put(2023, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonth.put(2024, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2025, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2026, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2027, new Byte[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonth.put(2028, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2029, new Byte[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2030, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2031, new Byte[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonth.put(2032, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2033, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2034, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2035, new Byte[]{30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        daysInMonth.put(2036, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2037, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2038, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2039, new Byte[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonth.put(2040, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2041, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2042, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2043, new Byte[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonth.put(2044, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2045, new Byte[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2046, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2047, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2048, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2049, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonth.put(2050, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonth.put(2051, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2052, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2053, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonth.put(2054, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonth.put(2055, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2056, new Byte[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2057, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2058, new Byte[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonth.put(2059, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2060, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2061, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2062, new Byte[]{30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31});
        daysInMonth.put(2063, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2064, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2065, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2066, new Byte[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        daysInMonth.put(2067, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2068, new Byte[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2069, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2070, new Byte[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonth.put(2071, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2072, new Byte[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2073, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonth.put(2074, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2075, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2076, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonth.put(2077, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonth.put(2078, new Byte[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2079, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2080, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonth.put(2081, new Byte[]{31, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2082, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2083, new Byte[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2084, new Byte[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2085, new Byte[]{31, 32, 31, 32, 31, 31, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2086, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2087, new Byte[]{31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2088, new Byte[]{30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2089, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2090, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2091, new Byte[]{31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2092, new Byte[]{31, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2093, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2094, new Byte[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2095, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 30, 30, 30});
        daysInMonth.put(2096, new Byte[]{30, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonth.put(2097, new Byte[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonth.put(2098, new Byte[]{31, 31, 32, 31, 31, 31, 29, 30, 29, 30, 30, 31});
        daysInMonth.put(2099, new Byte[]{31, 31, 32, 31, 31, 31, 30, 29, 29, 30, 30, 30});
        daysInMonth.put(2100, new Byte[]{31, 32, 31, 32, 30, 31, 30, 29, 30, 29, 30, 30});
        logger.info("Days in month loaded");
    }
}
