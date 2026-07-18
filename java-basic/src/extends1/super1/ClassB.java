package extends1.super1;

public class ClassB extends ClassA {
    public ClassB(int a) {
//        super();// 생략 가능
        this(0,0);
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super();// 생략 가능 -> 언젠가는 부모 생성자를 꼭 호출해야 함.
        System.out.println("Class B 생성자 a=" + a + ", b=" + b);
    }
}
