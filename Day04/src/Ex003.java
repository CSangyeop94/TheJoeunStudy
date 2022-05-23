import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id;

        System.out.println("메뉴 생성 : 1. 배수 출력 2. 성적 처리");
        int num = sc.nextInt();
        switch (num){
            case 1 :
                int sum1 = 0; // 짝수의 합
                int sum2 = 0; // 홀수의 합
                int sum3 = 0; // 3.4배수의 합
                System.out.println("초기치 입력");
                int su1 = sc.nextInt();
                System.out.println("최종치 입력");
                int su2 = sc.nextInt();
                for(int i=su1; i<=su2; i++){
                    if (i % 2 == 0) {
                        // 짝수의 합
                        sum1 +=i;
                    }else{
                        sum2 +=i;
                    }
                    if (i%3==0 || i%4 ==0) {
                        sum3 +=i;
                    }
                }
                System.out.println("짝수의 합 : " + sum1);
                System.out.println("홀수의 합 : " + sum2);
                System.out.println("짝수 + 홀수의 합 : " + (sum1 + sum2));
                System.out.println("3 또는 4의 배수의 합 : "+ sum3);
                // System.out.println("배수");
                break;
            case 2 :
                String grade;
                // System.out.println("성적 처리");
                System.out.println("kor : ");
                int kor = sc.nextInt();
                System.out.println("eng : ");
                int eng = sc.nextInt();
                int tot = kor + eng;
                int avg = tot/2;

                if (avg >= 60 && kor >=40 && eng >=40){
                    grade = "합격";
                }else {
                    grade = "불합격";
                }
                System.out.println("kor : " + kor + "eng : " + eng);
                System.out.println("평균 : " + avg + "합격여부 : " + grade);
                break;
        }
    }
}
