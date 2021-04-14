public class BizService {
    public void bizMethod(int i) throws BizException {
        System.out.println("start business method");
        if (i < 0)
            throw new BizException("i must be 0");

        System.out.println("end business method");
    }
}
