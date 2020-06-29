package com.pravidhi.nepalicalendar.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class DateConverterTest {

    @InjectMocks
    private DateConverter converter;

    @Test
    public void adToBS() throws Exception {
        String bsDate = converter.adToBS("1970-01-04");
        assertThat(bsDate, is("२०२६ साल पौष १९ गते आइतवार"));
    }
}