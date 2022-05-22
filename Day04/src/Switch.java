import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("이름 : " );
        String name = sc.next();
        switch (name) {
            case "홍길동" :
                System.out.println("홍길동");
                break;
            case "홍길순" :
                System.out.println("홍길순");
                break;
            case "강감찬" :
                System.out.println("강감찬");
                break;
            case "순대" :
                System.out.println("순대");
                break;
            default :
                System.out.println("알수없음");
                break;

        }
    }
}
