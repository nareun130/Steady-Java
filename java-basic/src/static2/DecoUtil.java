package static2;

public class DecoUtil {

    //인스턴스 변수를 쓸 필요없이 단순 기능을 제공할 거면, 이렇게 정적 메서드로 처리
    public static String deco(String str) {
        return "@" + str + "@";
    }
}
