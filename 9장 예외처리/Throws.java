public class Throws {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

    }

    public static int divide(int i, int j) throws ArithmeticException {
        int k = i / j;
        return k;
    }
}

// throw Exception을 사용하여 어떤 에러가 나오든 다시 위로 던져 줘서 에러를 찾게 한다.
