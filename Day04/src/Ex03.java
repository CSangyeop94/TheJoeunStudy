import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id;

        System.out.println("id를 입력 해주세요");
        id = sc.next();

        if(id.equals("Admin") || id.equals("admin")) {
            System.out.println("관리자 입니다.");
        }else {
            System.out.println("비관리자 입니다.");
        }

        System.out.println("1. 배수 출력"
                + "\n" + "2. 성적 처리");

        int num;

        num = sc.nextInt();

        if (num == 1) {
            int a; int b;
            System.out.println("초기값을 입력해주세요");
            a = sc.nextInt();
            System.out.println("최종값을 입력해주세요");
            b = sc.nextInt();
            int sum1 = 0; int sum2 = 0; int sum3 = 0;
            for(int i=a; i<=b; i++) {

                if(a%2 == 0) {
                    sum1 += i;
                    // 짝수의 합
                }else {
                    sum2 += i;
                    // 홀수의 합
                }
                if (a%3 == 0 || a%4 == 0) {
                    sum3 += i;

                }
            }
            System.out.println("짝수 의 합 : "+ sum1);
            System.out.println("홀수 의 합 : "+ sum2);
            System.out.println("3or 4의 배수의합 : "+ sum3);


        }else if (num == 2) {
            int kor;
            int eng;
            String grade;
            System.out.println("kor : ");
            kor = sc.nextInt();
            System.out.println("eng : ");
            eng = sc.nextInt();
            int tot = kor + eng;
            System.out.println("총합 : "+ tot);
            int avg = tot/2;

            if(avg >= 60 && kor >= 40 || eng >=40) {
                grade = "합격";
            }else {
                grade ="불합격";
                }System.out.println(
                    "kor : " + kor + "\t"
                            + "eng : "+ eng + "\t"
                            + "합격여부 : " + grade
            );

        }


        }
    }

