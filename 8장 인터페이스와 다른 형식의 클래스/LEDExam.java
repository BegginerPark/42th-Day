public class LEDExam {
    public static void main(String[] args) {
        TV tv = new LEDTV();
        tv.turnOn();
        tv.changeVolume(8);
        tv.changeChannel(39);
        tv.turnOff();
    }
}

// TV 인터페이스를 구현하고 있는 클래스의 인스턴스를 모두 사용할 수 있다는 것을 의미한다.
// 같은 인터페이스를 구현한다는 것은 클래스 사용법이 똑같다는 의미이다. 이것이 인터페이스를 사용하는 중요한 이유이다.
// 인터페이스를 사용하지 않으면 중복 기능들을 각 모델(클래스)마다 구현해야 한다.
