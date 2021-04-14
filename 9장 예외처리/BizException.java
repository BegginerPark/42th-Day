public class BizException extends RuntimeException {
    public BizException(String msg) {
        super(msg);
    }

    public BizException(Exception ex) {
        super(ex);
    }
}

// Exception 자체가 특별한 것은 아니다.
// 클래스 명만 봐도 어떤 오류가 발생했는지 사용자에게 직관 적으로 알려 주기 위해
