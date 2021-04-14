public class Taxi implements Meter {
    public void start() {
        System.out.println("Start");
    }

    public int BASE_FARE = 3000;

    public int stop(int distance) {
        int fare = BASE_FARE + distance * 2;
        System.out.println("Stop. the fare is " + fare);
        return fare;
    }
}
