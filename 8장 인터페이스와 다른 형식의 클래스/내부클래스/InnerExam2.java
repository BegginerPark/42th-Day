public class InnerExam2 {
    static class Cal {
        int value = 0;

        public void plus() {
            value++;
        }
    }

    public static void main(String[] args) {
        InnerExam2.Cal cal = new InnerExam2.Cal();
        cal.plus();
        System.out.println(cal.value);
    }

}

// static 이기 때문에 객체를 생성할 필요 없이 바로 접근해서 사용이 가능하다.
