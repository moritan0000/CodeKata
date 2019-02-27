package kata;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KarateChopTest {

    @BeforeAll
    void initial() {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test01() {
        assertEquals(-1, new KarateChop().chop(3, new int[]{}));
    }

    @Test
    void test02() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(3, new int[]{}));
    }

    @Test
    void test03() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(3, new int[]{1}));
    }

    @Test
    void test04() {
        KarateChop a = new KarateChop();
        assertEquals(0, a.chop(1, new int[]{1}));
    }

    @Test
    void test05() {
        KarateChop a = new KarateChop();
        assertEquals(0, a.chop(1, new int[]{1, 3, 5}));
    }

    @Test
    void test06() {
        KarateChop a = new KarateChop();
        assertEquals(1, a.chop(3, new int[]{1, 3, 5}));
    }

    @Test
    void test07() {
        KarateChop a = new KarateChop();
        assertEquals(2, a.chop(5, new int[]{1, 3, 5}));
    }

    @Test
    void test08() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(0, new int[]{1, 3, 5}));
    }

    @Test
    void test09() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(2, new int[]{1, 3, 5}));
    }

    @Test
    void test10() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(4, new int[]{1, 3, 5}));
    }

    @Test
    void test11() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(6, new int[]{1, 3, 5}));
    }

    @Test
    void test12() {
        KarateChop a = new KarateChop();
        assertEquals(0, a.chop(1, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test13() {
        KarateChop a = new KarateChop();
        assertEquals(1, a.chop(3, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test14() {
        KarateChop a = new KarateChop();
        assertEquals(2, a.chop(5, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test15() {
        KarateChop a = new KarateChop();
        assertEquals(3, a.chop(7, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test16() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(0, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test17() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(2, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test18() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(4, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test19() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(6, new int[]{1, 3, 5, 7}));
    }

    @Test
    void test20() {
        KarateChop a = new KarateChop();
        assertEquals(-1, a.chop(8, new int[]{1, 3, 5, 7}));
    }

}