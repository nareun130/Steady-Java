package polymorphism.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) { // jdk 16부터 바로 선언 가능
            System.out.println("Child 인스턴스임.");
            child.childMethod();
        }
    }
}