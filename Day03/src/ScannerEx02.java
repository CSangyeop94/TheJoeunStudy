import java.util.Scanner;

// 이름, 국어, 영어, 수학 점수를 입력 받아 총점과 평균을 구하시오

// 평균이 60점 이상이면 모든 과목이 40점 시상이면 합격 아니면 불합격
public class ScannerEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int kor; int eng; int math;


        System.out.println("이름 : ");
        name = sc.next();

        System.out.println("국어 점수 : ");
        kor = sc.nextInt();

        System.out.println("영어 점수 : ");
        eng = sc.nextInt();

        System.out.println("수학 점수 : ");
        math = sc.nextInt();

        double avg = (double) (kor+math+eng)/3.0;
        System.out.println("평균 점수 : " + avg);

        if(avg >=60 && kor >=40 && eng >=40 && math >=40) {
            System.out.println("합격");
        }else {
            System.out.println("불합격");
        }

    }
}
