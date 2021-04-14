public class InnerExam3 {
    public void exec() {
        class Cal {
            int value = 0;

            public void plus() {
                value++;
            }
        }
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }

    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}

// 지역 클래스
// 클래스 안 클래스에서 객체를 생성하고 실행
// 바로 불러와 사용이 가능