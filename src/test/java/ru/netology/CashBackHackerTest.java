package ru.netology;

import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class CashBackHackerTest {

    @org.testng.annotations.Test
    public void CalculationCashBackTest() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void CalculationNullCashBackTest() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}