package ru.netology;


public class CashBackHackerTest {


    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 500;
        int expected = 500;
        int actual = cashBackHacker.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemain1() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1500;
        int expected = 500;
        int actual = cashBackHacker.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemain2() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;
        int expected = 0;
        int actual = cashBackHacker.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);

    }


}