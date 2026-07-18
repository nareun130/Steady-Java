package static2.ex;

public class Car {
    private String name;
    static int totalCars = 0;

    public Car(String name) {
        System.out.println("차량 구입, 이름:" + name);
        totalCars++;
        this.name = name;
    }

    public static void showTotalCars() {
        System.out.println("car total = " + totalCars);
    }
}
