public class CompareOperatorEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); // A = 65 B = 66
        System.out.println("result4 = " + result4);

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5); // 값은 같아도 데이터 단위가달라 false
        System.out.println((float)v4 == v5);
        System.out.println((int)(v4*10) == (int)(v5*10));


    }
}
