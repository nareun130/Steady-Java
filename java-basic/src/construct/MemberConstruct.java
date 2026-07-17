package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 기본 생성자는 사용자 정의 생성자가 존재 시, 자동 생성 x
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        // 중복 제거!
        this(name, age, 50);// this 생성자는 코드의 첫줄에 위치해야 한다!!
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
