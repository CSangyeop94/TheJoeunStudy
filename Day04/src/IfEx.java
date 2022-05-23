public class IfEx {
    public static void main(String[] args) {

        int score = 80;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");

        }

        if(score<90)
            System.out.println("점수가 90보다 작습니다.");
        System.out.println("등급은 B 입니다."); //-- if 문과 상관없는 실행문
        // -- {} 중괄호가 없을시 if문 밑에 실행문 1개만 실행 나머지는 if문과 상관없이 실행
        // -- 2줄이상일때에는 {}사용
    }
}
