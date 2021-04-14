public class ExceptionExam {
    public static void main(String[] args) {

        int i = 10;
        int j = 5;
        try {
            int k = i / j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided by 0 " + e.toString());
        } finally {
            System.out.println("Don't care about exception, just run");
        }
        System.out.println("main end!!");
    }
}

// 0 으로 나누기 떄문에 오류 발생
// 위에서 오류가 났기 때문에 "man end!!"는 출력이 불가능 하다.
// try, catch, finally 함수를 사용하여 오류를 잡아 줄 수 있다.
