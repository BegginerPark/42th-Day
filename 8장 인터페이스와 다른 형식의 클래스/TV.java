public interface TV {
    // volume 의 최소 0 에서 최대 100 까지만 이라고 설정 해준다.
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;

    public void turnOn();

    public void turnOff();

    public void changeVolume(int volume);

    public void changeChannel(int channel);
}

// 객체에 어떤 기능이 있는가? 어떤 기능을 가져야 할까 를 고민 할때
// 기능들만 선언해 가지고 있는 것을 인터페이스라고 한다.
