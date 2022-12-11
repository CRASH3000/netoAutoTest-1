package ru.netology;

import static org.testng.Assert.assertEquals;

public class CashBackHackTest {
    CashBackHacker service = new CashBackHacker();

    @org.testng.annotations.Test
    public void testReturn1() {


        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testReturn2() {


        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test

    public void testReturn3() {


        int amount = 100;

        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }


    @org.testng.annotations.Test
    public void testReturn4() {


        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }


    @org.testng.annotations.Test
    public void testReturn5() {


        int amount = 200;

        int expected = 800;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testReturn6() {


        int amount = 2000;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
}
