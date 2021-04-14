public interface Calculator {
    public int plus(int i, int j);

    public int multiple(int i, int j);

    default int exec(int i, int j) {
        return i + j;
    }

    public static int exec2(int i, int j) {
        return i * j;
    }
}

// 인터페이스를 default 로 구현이 가능하다.
// 인터페이스에서 default 메서드를 설정함으로 인터페이스를 변경을 하여도 모든 클래스가 다시 변경사항을 구현하지 않게 하기 위하여
// 인터페이스에서 default 메서드를 사용한다.