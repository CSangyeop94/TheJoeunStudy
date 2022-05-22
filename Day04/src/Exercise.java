public class Exercise {
    public static void main(String[] args) {
        // num 05
        int value = 356;
        System.out.println(value / 100 * 100);


        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ( (double) ((lengthTop + lengthBottom)*height)/2.0 );
        System.out.println(area);

        // # 1 = (double) ((lengthTop + lengthBottom)*height)/2.0
//---------------------------------------------------------------------
        int x = 10;
        int y = 5;

        System.out.println((x>7) && (y<=5)); // -- true
        System.out.println((x%3 == 2) || (y%2 != 1)); // -- false
//---------------------------------------------------------------------
        double q = 5.0;
        double w = 0.0;

        double z = x % y;

        if(Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        }else {
            double result = z + 10;
            System.out.println("결과 : " + result);
        }
    }
}
