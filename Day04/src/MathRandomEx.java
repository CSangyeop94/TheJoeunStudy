import java.util.Scanner;

public class MathRandomEx {
    public static void main(String[] args) {

   /*     // 주사위 숫자
        int num1 = (int)(Math.random()*6) + 1;
        System.out.println(num1);

        int num2 = (int)(Math.random()*45) + 1;
        System.out.println(num2);*/
        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("번호를 입력해주세요 : " + "\n" +
                "1번 성적계산 "+ "\n" +
                "2번 구구단 "+ "\n" +
                "3번 아이디접속");
        num = sc.nextInt();

        if(num == 1) {

            String name;
            int kor = 0;
            int eng = 0;
            int mat = 0;

            System.out.println("성적계산");

            System.out.println("이름 : ");
            name = sc.next();

            System.out.println("국어점수 : ");
            kor = sc.nextInt();

            System.out.println("영어점수 : ");
            eng = sc.nextInt();

            System.out.println("수학점수 : ");
            mat = sc.nextInt();

            int tot = kor + eng + mat;
            int avg = tot/3;
            System.out.println(name);
            System.out.println("총점 : " + tot);
            System.out.println("평균 : " + avg);
        } else if (num == 2) {

            System.out.println("단을 입력하세요");
            for (int i =1; i<=9; i++){
                int k = 0;
                int j = 0;
                j = sc.nextInt();
                for(k=1; k<=9; k++) {
                    int score = (k * j);
                    System.out.println(j + "단" + ":" + j + "*" + k + "=" + score);
                }
            }
        }else if (num == 3){
            String id = "admin";
            String pw = "1111";

            System.out.println("id를 입력해주세요 : ");
            id = sc.next();
            System.out.println("pw를 입력해주세요 : ");
            pw = sc.next();

            if(id.equals("admin") && pw.equals("1111")){
                System.out.println("로그인 성공");
            }else {
                System.out.println("로그인 실패");
            }
        }
    }
}
