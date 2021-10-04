package bcds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void test_CSVReader() {
        CSVReader csv_in = new CSVReader("resources/breast-cancer-wisconsin.csv");
        csv_in.Data.forEach((elem) -> {
            assertNotNull(elem);
            for (String str : elem)
                assertNotEquals("", str);
        });
    }
}
