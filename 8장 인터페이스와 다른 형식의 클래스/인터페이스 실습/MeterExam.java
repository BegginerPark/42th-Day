public class MeterExam {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        boolean a = Meter.class.isInstance(taxi);
        if (a != true) {
            System.out.println("Taxi class is interface of Meter");
        } else if (taxi.stop(200) != 400) {
            System.out.println("stop(200)'s value be 400");
        } else {
            System.out.println("correct");
        }
    }
}
