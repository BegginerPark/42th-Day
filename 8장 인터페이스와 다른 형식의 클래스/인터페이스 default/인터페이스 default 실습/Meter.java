public interface Meter {
    public void start();

    // public abstract afterMidnight();

    public int stop(int distance);

    public default void afterMidnight() {
        System.out.println("Over 12am, if you need surcharge override this method");
    }
}
