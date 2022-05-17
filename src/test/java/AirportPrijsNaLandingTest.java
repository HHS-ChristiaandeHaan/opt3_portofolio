import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirportPrijsNaLandingTest {

    @Test
    public void getPrijs() {
        //arrange
        AirportPrijsNaLanding under1000 = new AirportPrijsNaLanding(850);
        AirportPrijsNaLanding under5000 = new AirportPrijsNaLanding(4000);
        AirportPrijsNaLanding over5000 = new AirportPrijsNaLanding(10000);
        //assert
        Assert.assertEquals(1149.5, under1000.getPrijs(true,true,3),0.001);
        Assert.assertEquals(100, under1000.getPrijs(false,false,2),0.001);
        Assert.assertEquals(1550, under5000.getPrijs(false,true,3),0.001);
        Assert.assertEquals(605, under5000.getPrijs(true,false,1),0.001);
        Assert.assertEquals(3993, over5000.getPrijs(true,true,1),0.001);
        Assert.assertEquals(3750, over5000.getPrijs(false,false,3),0.001);

    }
}