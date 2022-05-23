import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // id = admin // pw = 1234
        // 중첩 if
        // 아이디 입력 / 비밀번호 입력
        // 1.조건 아이디가 = admin 이면 비밀번호 비교 아이디가 맞지 않으면
        // 아이디 출력 = 잘못된 관리자 아이디 입니다.

        // 아이디가 admin라면 암호 비교 암호 일치하면 정상 로그인 아니면 로그인 실패 출력
        Scanner sc = new Scanner(System.in);
        String id;
        System.out.println("id를 입력해주세요");
        id = sc.next();
        if(id.equals("admin")) {
            System.out.println("pw 를 입력해주세요");
            String pw;
            pw = sc.next();
            if(pw.equals("1234")) {
                System.out.println("로그인에 성공 하였습니다.");
            }else{
                System.out.println("비밀번호가 틀렸습니다.");
            }
        }else {
            System.out.println("잘못된 관리자 아이디 입니다.");
        }
    }
}
