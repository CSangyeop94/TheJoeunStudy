import java.util.Scanner;

public class IfElseEx {
    public static void main(String[] args) {
        // 국어점수, 영어점수, 수학점수  => 점수를 알아서 대입
        // 평균을 구함
        // 90점이상 A, 80점이상 B, 70점이상 C, 60점이만 F
        // 출력 평균 : xx
        //      학점 : B
        Scanner sc = new Scanner(System.in);

        int kor;
        int eng;
        int mat;
        String grade;

        System.out.println("수학 점수 : ");
        kor = sc.nextInt();
        System.out.println("영어 점수 : ");
        eng = sc.nextInt();
        System.out.println("수학 점수 : ");
        mat = sc.nextInt();

        int tot = kor + eng + mat;
        int avg = tot/3;

        System.out.println("평균 점수 : " + avg);
        if(avg >= 90) {
            grade = "학점 : A";
        }else if (avg >= 80) {
            grade = "학점 : B";
        }else if (avg >= 70) {
            grade = "학점 : C";
        }else if(avg >= 60) {
            grade = "학점 : D";
        }else {
            grade = "학점 : F";
        } System.out.println("학점 : " + grade);
    }
}
