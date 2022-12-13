package ru.netology;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class CashBackHackTest {
    CashBackHacker service = new CashBackHacker();

    @org.junit.Test
    public void testReturn1() {

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testReturn2() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testReturn3() {

        int amount = 100;

        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testReturn4() {

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testReturn5() {

        int amount = 200;

        int expected = 800;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testReturn6() {

        int amount = 2000;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testReturn7() {

        int amount = -1;

        int expected = 1001;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.junit.jupiter.api.Test
    public void jupiterTestReturn1() {

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void jupiterTestReturn2() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void jupiterTestReturn3() {

        int amount = 100;

        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void jupiterTestReturn4() {

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void jupiterTestReturn5() {

        int amount = 200;

        int expected = 800;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void jupiterTestReturn6() {

        int amount = 2000;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void jupiterTestReturn7() {

        int amount = -1;

        int expected = 1001;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

}
