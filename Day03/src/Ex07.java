public class Ex07 {
    public static void main(String[] args) {
        int x =5;
        double y = 0.0;
        double z = x / y;
        double zz = x % y ;
        System.out.println(z + 2);
        System.out.println(zz + 5);
        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(zz));
    }
}
