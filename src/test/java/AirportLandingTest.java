import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirportLandingTest {

    @Test
    public void getPrijs() {
        //arrange
        int gewicht998 = 998;
        int gewicht999 = 999;
        int gewicht1000 = 1000;
        int gewicht1001 = 1001;
        int gewicht4998 = 4998;
        int gewicht4999 = 4999;
        int gewicht5000 = 5000;
        int gewicht5001 = 5001;
        //assert
        Assert.assertEquals(100, new AirportLanding(gewicht998).getPrijs());
        Assert.assertEquals(999, new AirportLanding(gewicht999).getPrijs());
        Assert.assertEquals(1000, new AirportLanding(gewicht1000).getPrijs());
        Assert.assertEquals(1001, new AirportLanding(gewicht1001).getPrijs());
        Assert.assertEquals(4998, new AirportLanding(gewicht4998).getPrijs());
        Assert.assertEquals(4999, new AirportLanding(gewicht4999).getPrijs());
        Assert.assertEquals(5000, new AirportLanding(gewicht5000).getPrijs());
        Assert.assertEquals(5001, new AirportLanding(gewicht5001).getPrijs());

    }
}