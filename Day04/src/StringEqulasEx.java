public class StringEqulasEx {
    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철";
        String strVar3 = new String("신민철");
        int v1 = 10;

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1 == strVar3);
        // new 로 변수 저장시 저장영역이 달라 false 가나옴
        System.out.println();
        System.out.println(strVar1.equals(strVar2));
        // 순수하게 문자열만 비교하고싶을떄는 .equals() 메소드 사용
        System.out.println(strVar1.equals(strVar3));

        // 참조번지

        System.out.println(strVar1.hashCode()); // 주소번지 확인 메소드
        System.out.println(strVar2.hashCode());
        System.out.println(strVar3.hashCode());


    }
}
