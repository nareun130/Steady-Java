package class1;

public class ClassStart5 {
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

        Student[] students = new Student[]{student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + "나이:" + students[i].age + "성적:" + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적:" + s.grade);
        }

        for (Student s : students) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적:" + s.grade);
        }

    }
}
