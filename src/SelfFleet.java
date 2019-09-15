import java.util.ArrayList;

public class SelfFleet {
    private ArrayList<Ship> fleet;

    public ArrayList<Ship> getFleet() {
        return fleet;
    }

    public SelfFleet(Ship first, Ship second, Ship third) {
        this.fleet = new ArrayList<>();
        fleet.add(first);
        fleet.add(second);
        fleet.add(third);
    }
}
