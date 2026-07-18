package extends1.super1;

public class ClassC extends ClassB {
    public ClassC() {
//        super(); -> ClassB의 기본 생성자가 없으므로
        super(10, 20);
        System.out.println("Class C 생성자");
    }
}
