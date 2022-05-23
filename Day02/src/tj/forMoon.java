package tj;

/*
* for(초기치.조건.증가치) {
*           반복.문장
*   }
*   ++/-- 증감연산자 ++i 전위연산 i++ 후위연산
* */

public class forMoon {
    public static void main(String[] args) {

       int sum = 0;
     /*  for(int i =1; i<10; i++) {
           while (i <  10) {
               sum += i;
               i++;

           }
           System.out.println("합계 : " + sum);
       }*/


        for(int i =1; i <= 10; i++){
           sum = sum + i;

         //System.out.println(sum);
              }
        System.out.println("1부터 10까지의 함 : " +sum);


    }
}
