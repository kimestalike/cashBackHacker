package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn100When900PassedAsArgument() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionWhenNegativeValuePassedAsArgument() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertThrows(Exception.class, () -> {
            service.remain(-1);
        });
    }
}
