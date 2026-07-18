package polymorphism.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child)parent1;
        child1.childMethod();//문제 없음

        Parent parent2 = new Parent();//Parent만 힙 영역에 생성됨. -> Child가 생성되지 않음.
        Child child2 = (Child)parent2;//런타입 오류 - ClassCastException
        child2.childMethod(); //실행 불가

    }
}
