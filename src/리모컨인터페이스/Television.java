package 리모컨인터페이스;

public class Television implements RemoteControl {
    int volume;

    @Override
    public void turnOn() {
        System.out.println("TV 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_Volume) {
            this.volume = RemoteControl.MAX_Volume;
        } else if(volume < RemoteControl.MIN_Volume) {
            this.volume = RemoteControl.MIN_Volume;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
    @Override
    public void getInfo() {
        System.out.println("TV 입니다.");
        System.out.println("현재 TV 볼륨은 " + volume + " 입니다.");
    }
    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("TV를 무음 처리합니다.");
        else System.out.println("TV를 무음 처리를 해제합니다.");
    }
}
