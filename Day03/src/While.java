public class While {
    public static void main(String[] args) {
        int kor = 80;
        int eng = 100;
        // 함수 호출
        tot(kor, eng);
        //System.out.println("총점 : " + tot);
        System.out.println("종료");
    }
    // 성적 합산을 내는 메소드 생성
    // -위을 값을 받기위한 메게변수
    public static void tot(int kor, int eng) {
        int tot = kor + eng;
        System.out.println("총점 : " + tot);

    }
}
