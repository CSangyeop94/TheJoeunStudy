package tj;

import java.util.Scanner;

public class CheckValueBeforeCasting3 {
    public static void main(String[] args) {

       /* int jumsu = -1;
        if(jumsu < 0 || jumsu > 100) {
            System.out.println("점수를 잘못 입력");
        }else {
            System.out.println("점수 : " + jumsu);
        }*/
          /* int jumsu = 80;
        if(jumsu >= 0 && jumsu <= 100) {
            System.out.println("점수 : " + jumsu);
        }else {
            System.out.println("점수를 잘못 입력");
        }*/

        int kor = 80; int eng = 81;
        if(kor < 0 || kor > 100 || eng < 0 || eng > 100) {
            System.out.println("점수를 잘못 입력");
        }else {
            System.out.println("점수 : " + (kor + eng));
        }


   }
}
