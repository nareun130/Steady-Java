package oop1;

public class MusicPlayerMain2 {

    //여기까지는 절차지향
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();
        on(data);

        volumeUp(data);
        volumeUp(data);
        volumeDown(data);

        showStatus(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("플레이어 시작");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("플레이어 종료");

    }

    static void volumeUp(MusicPlayerData data) {
        //볼륨 증가
        data.volume++;
        System.out.println("플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        //볼륨 감소
        data.volume--;
        System.out.println("플레이어 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        //플레이어 상태
        System.out.println("플레이어 상태");
        if (data.isOn) {
            System.out.println("플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("플레이어 OFF");
        }
    }

}
