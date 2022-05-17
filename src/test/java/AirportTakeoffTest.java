import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AirportTakeoffTest {

    @Test
    public void toestemmingTakeoffCessna() {
        //arrange
        AirportTakeoff schiphol = new AirportTakeoff(50, 1000);
        //act
        //assert
        Assert.assertTrue(schiphol.toestemmingTakeoff(10,400,true));
        Assert.assertTrue(schiphol.toestemmingTakeoff(60,1400,true));
        Assert.assertFalse(schiphol.toestemmingTakeoff(10,1200,true));
        Assert.assertFalse(schiphol.toestemmingTakeoff(10,400,false));

    }
}