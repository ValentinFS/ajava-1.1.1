package ru.netology;

import org.junit.Test;

import org.junit.Assert;

public class CashbackHackServiceTest extends Assert {

    CashbackHackService cashback = new CashbackHackService();

    @Test
   public void shouldReturn100IfAmountIs900() {
        int amount = 900;
        int actual = cashback.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn900IfAmountIs1100() {
        int amount = 1100;
        int actual = cashback.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

}