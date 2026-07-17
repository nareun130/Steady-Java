package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("플레이어 시작");
    }

    void off() {
        isOn = false;
        System.out.println("플레이어 종료");

    }

    void volumeUp() {
        //볼륨 증가
        volume++;
        System.out.println("플레이어 볼륨 : " + volume);
    }

    void volumeDown() {
        //볼륨 감소
        volume--;
        System.out.println("플레이어 볼륨 : " + volume);
    }

    void showStatus() {
        //플레이어 상태
        System.out.println("플레이어 상태");
        if (isOn) {
            System.out.println("플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("플레이어 OFF");
        }
    }
}
