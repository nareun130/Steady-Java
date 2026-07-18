package static1;

public class Data3 {
    // 인스턴스 변수
    public String name;
    // 클래스 변수 : 해당 변수는 메서드 영역에서 관리 -> 해당 클래스 JVM에 로딩되는 순간 생성.JVM이 종료될 때까지 생명주기가 이어짐.
    public static int count;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
