public class Taxi implements Meter {
    @Override
    public void start() {
    }

    @Override
    public int stop(int distance) {
        return distance * 2;
    }
}
