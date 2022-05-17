public class AirportPrijsNaLanding {
    private static double bagageAfhandeling = 800;
    private static double NederlandsVliegtuigBTW = 1.21;
    private static double meerDan2Passagiers = 2;
    private double beginPrijs;


    public AirportPrijsNaLanding(int gewicht) {
        this.beginPrijs = new AirportLanding(gewicht).getPrijs();
    }
    public double getPrijs(boolean NederlandsVliegtuig, boolean bagageAfhandeling, int passagiers){

        double prijs = beginPrijs;

        if (passagiers > meerDan2Passagiers) {
            prijs = prijs * 1.5;
        }
        if (bagageAfhandeling) {
            prijs = prijs + 800;
        }
        if (NederlandsVliegtuig){
            prijs = prijs * NederlandsVliegtuigBTW;
        }
        return prijs;
    }
}
