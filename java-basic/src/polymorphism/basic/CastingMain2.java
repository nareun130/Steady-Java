package polymorphism.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = (Parent) child; // 업 캐스팅 생략 가능, 생략 권장
        Parent parent2 = child; // 업캐스팅 생략

        parent.parentMethod();
        parent2.parentMethod();
    }


}
