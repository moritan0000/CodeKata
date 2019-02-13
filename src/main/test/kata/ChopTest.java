package kata;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ChopTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test01() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(3, new int[]{}));
    }

    @Test
    void test02() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(3, new int[]{}));
    }

    @Test
    void test03() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(3, new int[]{1}));
    }

    @Test
    void test04() {
        Chop a = new Chop();
        assertEquals(0, a.chop(1, new int[]{1}));
    }

    @Test
    void test05() {
        Chop a = new Chop();
        assertEquals(0, a.chop(1, new int[]{1, 3, 5}));
    }

    @Test
    void test06() {
        Chop a = new Chop();
        assertEquals(1, a.chop(3, new int[]{1, 3, 5}));
    }

    @Test
    void test07() {
        Chop a = new Chop();
        assertEquals(2, a.chop(5, new int[]{1, 3, 5}));
    }

    @Test
    void test08() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(0, new int[]{1, 3, 5}));
    }

    @Test
    void test09() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(2, new int[]{1, 3, 5}));
    }

    @Test
    void test10() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(4, new int[]{1, 3, 5}));
    }

    @Test
    void test11() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(6, new int[]{1, 3, 5}));
    }

    @Test
    void test12() {
        Chop a = new Chop();
        assertEquals(0, a.chop(1, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test13() {
        Chop a = new Chop();
        assertEquals(1, a.chop(3, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test14() {
        Chop a = new Chop();
        assertEquals(2, a.chop(5, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test15() {
        Chop a = new Chop();
        assertEquals(3, a.chop(7, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test16() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(0, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test17() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(2, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test18() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(4, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test19() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(6, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test20() {
        Chop a = new Chop();
        assertEquals(-1, a.chop(8, new int[]{1, 3, 5, 7}));
    }

}