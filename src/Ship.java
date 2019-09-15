public class Ship {
    private String name;
    private int cargo;

    public String getName() {
        return name;
    }

    public Ship(String name, int cargo) {
        this.name = name;
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
}
