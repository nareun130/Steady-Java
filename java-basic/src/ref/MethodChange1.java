package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a);
    }

    public static void changePrimitive(int x) {
        x = 20; //-> 변수,  a,x 둘다 각 각 숫자 10을 가지고 있다!!!
        //! 이 때 x는 20, a는 10
    }
}
