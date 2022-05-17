public class AirportLanding {
    private int gewicht;

    public AirportLanding(int gewicht) {
        this.gewicht = gewicht;
    }
    public int getPrijs(){
        if (gewicht < 1000) {
            return 100;
        }
        else if (gewicht < 5000) {
            return 500;
        }
        else if (gewicht >= 5000) {
            return 2500;
        }
        else {
            return -1;
        }
    }
}
