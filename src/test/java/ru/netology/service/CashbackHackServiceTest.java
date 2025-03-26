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

    @Test
    public void shouldThrowExceptionWhenNegativeValuePassedAsArgument() {
        CashbackHackService service = new CashbackHackService();

        assertThrows(Exception.class, () -> {
            service.remain(-1);
        });
    }
}
