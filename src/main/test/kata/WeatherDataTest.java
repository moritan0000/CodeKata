package kata;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class WeatherDataTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void weatherTest() {
        WeatherData a = new WeatherData();
        assertEquals(-1,a.weather());
    }
    @Test
    void weatherTest2(){
        WeatherData a = new WeatherData();
        a.weather();
    }
}