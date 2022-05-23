import java.util.Scanner;

public class IfNestedEx {
    public static void main(String[] args) {
         /*int i;
        for (i=1; i<=20; i++) {
        int score = (int)(Math.random()*20 + 81);
        System.out.println("점수 : " + score);
        }*/
        // 스캐너 사용 중첩if 90점 이상 A+ 아니면 A0
        // 85점 이상 B+ 아니면 B-
        // 80점 미만 학점 미달
        Scanner sc = new Scanner(System.in);
        int score;
        String grade;
        System.out.println("점수를 입력해주세요 : ");

        score = sc.nextInt();


        System.out.println(score + "점");
        if (score >= 90) {
            if (score >= 95) {
                grade = "A+";
            } else {
                grade = "A0";
            }
        }
        else if ( score >= 85) {
            grade = "B+";
        } else {
            grade = "B-";
        }
        if (score < 80){
            System.out.println("학점미달");
        }System.out.println("결과 : " + grade);
    }

        }



