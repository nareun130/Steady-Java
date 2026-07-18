package extends1.ex2;

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("전기 충전");
    }

    @Override
    public void move() {
        System.out.println("전기차가 이동");
    }
}
