package polymorphism.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
//        poly.childMethod();

        //다운 캐스팅(부모타입 -> 자식 타입)
        Child child = (Child)poly; //참조값을 읽은 다음 자식 타입으로 지정
        //* 이렇게 한다고 Parent poly의 타입이 변하는 것은 아님!!
        child.childMethod();
        child.parentMethod();

        //일시적 다운 캐스팅
        ((Child)poly).childMethod();
    }
}
