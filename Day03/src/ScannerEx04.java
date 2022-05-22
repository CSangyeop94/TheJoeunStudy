import java.util.*;
/* 이름, 국어, 영어 수학 입력
    총점은 int형, 평균은 double 형, 합격여부 : 합or 불
    총점은 60이상 각 점수 40이 넘어야 합
* */
public class ScannerEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int kor;
        int eng;
        int mat;
        int tot;
        double avg;
        String grade;


        System.out.println("이름 : ");
        name = sc.next();

        System.out.println("국어 점수 : ");
        kor = sc.nextInt();

        System.out.println("영어 점수 : ");
        eng = sc.nextInt();

        System.out.println("수학 점수 : ");
        mat = sc.nextInt();

        tot = tot(kor, eng, mat);
        avg = avg(kor, eng, mat);
        grade = grade(kor, eng, mat);
        System.out.println("=======================================================");
        System.out.println("이름"+"\t"+"\t"+"국어"+"\t"+"영어"+"\t"+
                        "수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격or불합격");
        System.out.println("=======================================================");
        System.out.println(name+"\t"+"kor"+"\t"+"eng"+"\t"+"mat"+"\t"+"tot"+"\t"+"avg"+"\t"+grade);

    }public static int tot(int kor, int eng, int mat) {
        int tot = kor + eng + mat;
        double avg = (double) tot / 3.0;
        return tot;
    }

    public static double avg(int kor, int eng, int mat) {
        double avg = (kor + eng + mat) / 3.0;
        return avg;
    }
    public static String grade(int kor, int eng, int mat) {
        String grade;
        double avg = (kor + eng + mat) / 3.0;
        if(avg >= 60.0 && kor >= 40 && eng >= 40 && mat >= 40) {
            grade = "합격";
        }else{
            grade = "불합격";
        }
        return grade;
    }
}