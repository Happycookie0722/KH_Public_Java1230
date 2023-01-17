package 은행만들기;

public class BankMain {
    public static void main(String[] args) {
        BankClass kakao = new BankClass("카카오", 1000);
        BankClass shinhan = new BankClass("신한", 1000);
        BankClass NH = new BankClass("농협", 0);

        kakao.setDeposit(12000);
        kakao.setWithdraw(15000);
        kakao.viewAccount();
        System.out.println(BankClass.getCnt()); // getCnt 는 static 를 사용했으므로 클래스 소속이다. kakao.getCnt() 가 아닌
                                                // kakao.getCnt() 가 아닌 클래스 BankClass를 입력 해야 getCnt를 쓸 수 있다.

        // 자주 쓰는 단축 명령어(String 변수)들을 static 으로 미리 만들어두고 사용할 수 있다.
        System.out.println(Util.getCurrentDate("yyyy년MM월dd일 hh:mm:ss"));
        System.out.println("서버 주소 : " + Util.KH_DOMAIN);
    }
}
