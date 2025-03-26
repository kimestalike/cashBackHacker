package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn100When900PassedAsArgument() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }

    // Странное поведение. Если человек
    @Test
    public void shouldThrowExceptionWhenNegativeValuePassedAsArgument() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(-1);

        assertEquals(actual, expected);
    }
}
