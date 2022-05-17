import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    @Test
    void getTrue() {
        Airport schiphol = new Airport("shiphol");
        boolean expected_false = true;
        assertEquals(expected_false, Airport.getTrue());
    }


}