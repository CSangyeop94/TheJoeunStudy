public class Ex05 {
    public static void main(String[] args) {
        int v1 =10;
        int v2 = ~v1;
       /* System.out.println(Integer.toBinaryString(v1));
        System.out.println(toBinaryString2(v1));
        System.out.println(Integer.toBinaryString(v2));
        System.out.println(toBinaryString2(v2));*/
        /*String vv1 = toBinaryString2(v1);
        System.out.println(vv1.length());
        String vv2 = toBinaryString2(v2);
        System.out.println(vv2.length());*/
        System.out.println(toBinaryString2(v1));
        System.out.println(toBinaryString2(v2));

    }
    public static String toBinaryString2(int value){
        String str = Integer.toBinaryString(value);
        /*while(str.length() < 32){
         //   str = "@" +str;
            }*/
    return str;
    }
}
