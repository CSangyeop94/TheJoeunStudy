import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
        * 스케너 스위치문 사용
        * 국어 영어 수학 점수 입력 받아 평균산출
        * 90~100 a학점 80점이상 b 70이상 c 60이상 d 60미안 f*/

        Scanner sc = new Scanner(System.in);
        int kor;
        int eng;
        int mat;

        System.out.println("국어 점수 : ");
        kor = sc.nextInt();
        System.out.println("영어 점수 : ");
        eng = sc.nextInt();
        System.out.println("수학 점수 : ");
        mat = sc.nextInt();

        int tot = kor + eng + mat;
        int avg = tot/3;
        System.out.println("평균 점수 : " + avg);

        switch (avg/10) {
            case 10 :
            case 9:
                System.out.println("학점 : A");
                break;
            case 8:
                System.out.println("학점 : B");
                break;
            case 7:
                System.out.println("학점 : C");
                break;
            case 6:
                System.out.println("학점 : D");
                break;
            case 5:
                System.out.println("결과 : F");
                break;

        }

    }
}
