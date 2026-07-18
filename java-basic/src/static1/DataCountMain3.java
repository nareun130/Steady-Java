package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + data3.count); // 인스턴스를 통한 접근(비추천) -> 결국에는 클래스 변수를 가져다 씀.
        System.out.println("C count=" + Data3.count); // 클래스를 통한 접근 => 이렇게 써야 가져다 쓰는 입장에서 더 알기가 명확!

    }
}
