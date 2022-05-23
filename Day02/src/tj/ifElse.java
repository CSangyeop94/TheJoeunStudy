package tj;

public class ifElse {
    public static void main(String[] args) {

        /*
        * if (조건) {
        *    조건이 참이면 실행
        *    }else {
        *    if에서 거짓이면 실행
        *       }
        * */
        int v1 = 15;
        int v2 = 0;
        if(v1 > 10) {
          v2 = v1 - 10;
        }
        int v3 = v1 + v2 + 5;
        System.out.println("합 : " + v3);

        /*2진수

        128 64 32 16 8 4 2 1
         1   1  1  1 1 1 1 1
            120 = 01110010
             96 = 01100000
            118 = 01110110
        10101000 = 168
        11000000 = 192
        11110010 = 242
        8진수 2n3
        16진수 2n4
        168 => 10101000
        |10|101|000| => 250(8진수) 1 2n2 2n3
        |1010|1000| => A8 (16)진수에서는  10 = A
                                        11 = B
                                        12 = C
            192 => 11000000
                |11|000|000| => 300(8진수)
                |1100|0000| => C0(16진수)
        185 => 10111001 (2진수)
                |10|111|001| => 271(8진수)
                |1011|1001| => B9(16진수)

        00000001 => 1의 보수 1111110 => 2의 보수 +1 => 11111111 => -1
                00000010 => 1의보수 1111101 => 2의 보수 + 1 => 11111110 => -2
                10 => 보수로 이용해서 음수 00001010 => 11110110 => -10
                20 => 보수를 이용해서 음수 00010100 => 11101100 => -20*/
    }
}