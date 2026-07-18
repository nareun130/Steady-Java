package static1;

public class DataCountMain2 {
    public static void main(String[] args) {

        //* Data2와 관련된 값읕 변경하고 싶은데 Counter라는 별도의 클래스를 추가로 사용해야 함.
        //-> 생성자의 매개변수도 추가되고, 생성자가 복잡해지면서 생성자 호출부분도 복잡해짐0.
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A Count=" + counter.count);
        Data2 data2 = new Data2("B", counter);
        System.out.println("B Count=" + counter.count);
        Data2 data3 = new Data2("C", counter);
        System.out.println("C Count=" + counter.count);
    }
}
