package com.codurance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearShould {

    private LeapYear leapYear;

    @BeforeEach
    void setup(){
        leapYear = new LeapYear();
    }

    @Test
    void year_is_Not_Leap_Year(){
        assertEquals("not a Leap Year", leapYear.isLeapYear(1997));
    }

    @ParameterizedTest
    @ValueSource(ints = {1996, 2000, 2004})
    void is_leap_year(int year) {
        assertEquals("is a Leap Year", leapYear.isLeapYear(year));
    }

    @Test
    void year_1800_is_not_leap_year() {
        assertEquals("not a Leap Year", leapYear.isLeapYear(1800));
    }

    @Test
    void year_1900_is_not_leap_year(){
        assertEquals("not a Leap Year", leapYear.isLeapYear(1900));
    }

}
