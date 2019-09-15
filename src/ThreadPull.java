

public class ThreadPull implements Runnable {
    private Ship ship;
    private Dock dock;

    public ThreadPull(Ship ship, Dock dock) {
        this.ship = ship;
        this.dock = dock;
    }

    @Override
    public synchronized void run() {
        while (!dock.unloading(ship)) {
            dock.unloading(ship);
            try {
                Thread.sleep((long) (dock.getTime() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
