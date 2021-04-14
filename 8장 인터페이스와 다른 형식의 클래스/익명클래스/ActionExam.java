public class ActionExam {
    public static void main(String[] args) {
        Action action = new MyAction() {
            @Override
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();
    }
}

// 중괄호 안에 있는 것은 이름없는 객체이다.
// 상속 받을 필요 없이 바로 사용하기 위해서 사용 한다.
