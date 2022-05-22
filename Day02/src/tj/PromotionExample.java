package tj;

public class PromotionExample {
    public static void main(String[] args) {
        byte byreValue = 10;
        int intValue = byreValue; // int <- byte
        System.out.println(intValue);

        char charValue = '나';
        intValue = charValue; // int <- char
        System.out.println("나의 유니코드=" + intValue);

        intValue = 500;
        long longValue = intValue; // long <- int
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue; // double <- int
        System.out.println(doubleValue);

        // 작은 크기 타입 = (작은 크기 타임) 큰 크기 타입
           //      <- 강제 타입 변환
    }
}
