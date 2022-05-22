// 함수명 grade1 void 명
// 함수 생성 grade1() 국어, 영어, 수학 점수를 매개 변수로 받아
// 함수명 grade2 void 명
// 함수 생성 grade2() 국어, 영어, 수학 점수를 매개 변수로 받아
// 평균이 60점 이상이면 합격 아니면 불합격 출력
// return 합격/불합격 리턴해서 출력

public class Ex03 {
    public static void main(String[] args) {
        int kor = 80;
        int eng = 100;
        int mat = 90;

        //함수 호출
        grade1(kor, eng, mat);
    }
    // grade1 함수 생성 void 뺍 리턴값으 없는 함수 (매소드)
    public static void grade1(int kor, int eng, int mat) {
        int tot = kor + eng + mat;
        int avg = tot/3;
        System.out.println("총점 : " + tot);
        System.out.println("평균 : " + avg);
        if(avg >= 60) {
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }
    }

}
