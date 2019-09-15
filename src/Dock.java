public class Dock {
    private double time;
    private int box;

    public Dock(double time, int box) {
        this.time = time;
        this.box = box;
    }

    public double getTime() {
        return time;
    }

    boolean unloading(Ship ship) {
        if (ship.getCargo() != 0) {
            ship.setCargo(ship.getCargo() - 1);
            System.out.println(Thread.currentThread().getName() + "; На корабле "+ ship.getName()+ " осталось "+ship.getCargo()+" ящиков");
            return false;
        } else {
            System.out.println(Thread.currentThread().getName() + "; Корабль "+ ship.getName()+ " разгружен");
            return true;
        }
    }
}
