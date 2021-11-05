import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearInspectorTest {

    /*YearInspector yi;

    @BeforeEach
    public void setup(){
        yi = new YearInspector();
    }

    @Test
    public void ifYearIsDivisibleBy4ButNot100(){
        assertEquals(" Leap Year", yi.inspectYear(2000));
    }

    @Test
    public  void ifYearIsDivisibleBy400(){
        assertEquals(" Leap Year", yi.inspectYear(2000));
    }

    @Test
    public void ifYearIsNotDivisibleBy4(){
        assertEquals(" Not a leap year", yi.inspectYear(2021));
    }

    @Test
    public void ifYearIsDivisibleBy100ButNot400(){
        assertEquals(" Not a leap year", yi.inspectYear(1700));
        assertEquals(" Not a leap year", yi.inspectYear(1800));
        assertEquals(" Not a leap year", yi.inspectYear(1900));
    }*/


    YearInspector currentYear;

    @BeforeEach
    public void setup(){
        currentYear = new YearInspector();
    }


    @Test
    public void isYearDivisibleBy4ButNot100(){
        assertEquals(true, currentYear.isLeapYear(2000));
    }

    @Test
    public void isYearDivisibleBy400(){
        assertEquals(true, currentYear.isLeapYear(2000));
    }

    @Test
    public void isYearNotDivisibleBy4(){
        assertEquals(false, currentYear.isLeapYear(2021));
    }

    @Test
    public void isYearDivisibleBy100ButNot400(){
        assertEquals(false, currentYear.isLeapYear(1700));
        assertEquals(false, currentYear.isLeapYear(1800));
        assertEquals(false, currentYear.isLeapYear(1900));
    }

}

