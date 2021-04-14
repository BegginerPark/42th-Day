public class MyCalExam {
    public static void main(String[] args) {
        Calculator mycal = new MyCal();
        mycal.plus(3, 4);
        int i = mycal.exec(5, 6);
        System.out.println(i);

        Calculator.exec2(3, 4);
    }
}
