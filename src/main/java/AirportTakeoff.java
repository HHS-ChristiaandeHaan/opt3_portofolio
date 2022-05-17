public class AirportTakeoff {
    private int tegenwindBijZwareLading;
    private int maxGewichtLading;

    public AirportTakeoff(int tegenwindBijZwareLading, int maxGewichtLading) {
        this.tegenwindBijZwareLading = tegenwindBijZwareLading;
        this.maxGewichtLading = maxGewichtLading;
    }

    public boolean toestemmingTakeoff(int tegenwind, int gewichtLading, boolean toestemming) {
        return (toestemming && (tegenwind > tegenwindBijZwareLading || gewichtLading <= maxGewichtLading));
    }
}
