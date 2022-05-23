public class Ex {
    public static void main(String[] args) {
        /*int sum = 0;
        int j =10;
        int k =10;
        for(int i = 1; i <=10; i++) {
            sum += i;
            ++j;
            --k;
        }System.out.println("1 ~10 까지의 합계 : " + sum);
        System.out.println("j의 증가 값 : "+ j);
        System.out.println("k의 증가 값 : " +k);*/

        /*int v1 = 5;
        int v2 = 2;

        if( v1 % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }*/

        // for / while 문 이용
        // 1부터 100까지의 합
        // 홀수의 합 : xx
        // 짝수의 합 : xx
        int sum1 = 0;
        int sum2 = 0;
        int j = 1 ;

    /*    for(int i=1; i<=100; i++){
            if(i % 2 == 0){
                //짝수의 합
                sum1 +=i;
            }else {
                //홀수의 합
                //sum2 +=i
                sum2 +=i;
            }
        }*/
        while(j<=100){
            if(j % 2 == 0){
                //짝수의 합
                sum1 +=j;
            }else {
                //홀수의 합
                //sum2 +=i
                sum2 +=j;
            }j++;


        } System.out.println("짝수의 합 : " + sum1);
        System.out.println("홀수의 합 : " + sum2);
        System.out.println("총합 : " + (sum1 + sum2));
    }
}
