package kata;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DataMungingTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void weatherTest() {
        DataMunging a = new DataMunging();
        assertEquals(14, a.fetchUrl(DataMunging.weatherUrl));
    }

    @Test
    void weatherTest2() {
    }
}