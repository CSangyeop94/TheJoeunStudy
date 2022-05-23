package tj;

public class FloatDoubleExample {
    public static void main(String[] args) {

        double var1 = 3.14;
        //float var2 = 3.14; //컴파일 에러
        float var3 = 3.14F;

        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789F;

        System.out.println("var1 : " + var1);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);

        // e 지수 사용
        int var6 = 3000000;
        double var7 = 3e6;
        float var8 = 3e6f;
        double var9 = 2e-3;
        System.out.println(var7);
        System.out.println(var8);
        System.out.println(var9);

    }
}
