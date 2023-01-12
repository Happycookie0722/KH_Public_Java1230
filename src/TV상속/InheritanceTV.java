package TV상속;

public class InheritanceTV {
    public static void main(String[] args) {
        ProductTV lgTv = new ProductTV(" 우리집 TV");
        lgTv.setPower(true);
        lgTv.setVolume(50);
        lgTv.setChannel(1500, true);
        lgTv.viewTV();


    }
}
