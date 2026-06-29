package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        // * 학생 하나를 제거하는데, 인덱스를 잘 생각! -> 사람이 관리하기에 좋지 x
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] +" 나이 : " + studentAges[i] +" 성적: " + studentGrades[i] );
        }

    }
}
