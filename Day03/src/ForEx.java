// for문 이용
// 1~100까지의 3or 4의 배수의 합
// 3or4배수의 합 : xxxx

// for 문 이용해서 구구단 스캐너 이용
// 단을 입력 :
// 3*1~~~~~

public class ForEx {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
            }
        }
        System.out.println("3, 4의 배수의 합 : " + sum);
    }
}