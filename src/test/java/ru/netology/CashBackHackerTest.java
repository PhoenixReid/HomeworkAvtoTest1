package ru.netology;


import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {

    @org.junit.Test
    public void CalculationCashBackTest() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void CalculationNullCashBackTest() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}