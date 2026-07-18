package polymorphism.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("child -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent-> child");
        Parent poly = new Child();
        poly.parentMethod();

        // 역은 불가 -> 자식은 부모를 담을 수 없다.
//        Child poly2 = new Parent();
//        poly.childMethod(); // 자식 메서드 실행 불가

    }
}
