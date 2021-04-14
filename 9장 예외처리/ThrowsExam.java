public class ThrowsExam {
    public static void main(String[] args) {
        ThrowsTest ex = new ThrowsTest();
        int num = ex.get50thItem(new int[100]);
        System.out.println("array's 50th value: " + num);
    }
}
