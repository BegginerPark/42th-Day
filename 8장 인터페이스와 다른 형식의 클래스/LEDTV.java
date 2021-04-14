public class LEDTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("ON");
    }

    @Override
    public void turnOff() {
        System.out.println("OFF");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("Control Volume");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Change channel");
    }
}
