package class1;

public class ClassStart3 {
    public static void main(String[] args) {

        Student student1;
        //메모리 공간 확보
        student1 = new Student();// -> 메모리에 객체가 올라간 후, 그 메모리 참조값이 student1으로 들어감.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        //객체 = 인스턴스 -> 다만, 클래스와의 관계를 강조할 때, 인스턴스라는 표현 사용
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름:" + student1.name + "나이:" + student1.age + "성적:" + student1.grade);
        System.out.println("이름:" + student2.name + "나이:" + student2.age + "성적:" + student2.grade);
    }
}
