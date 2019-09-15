import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        SelfFleet selfFleet = new SelfFleet(
                new Ship("Titanic", 10),
                new Ship("Canvas", 10),
                new Ship("Ship", 10));
        Dock dock = new Dock(0.5, 1);

        executorService.submit(new ThreadPull(selfFleet.getFleet().get(0),dock));
        executorService.submit(new ThreadPull(selfFleet.getFleet().get(1),dock));
        executorService.submit(new ThreadPull(selfFleet.getFleet().get(2),dock));

        executorService.shutdown();
    }
}
