// 함수명 grade2 void 명
// 함수 생성 grade2() 국어, 영어, 수학 점수를 매개 변수로 받아
// 평균이 60점 이상이면 합격 아니면 불합격 출력
// return 합격/불합격 리턴해서 출력

public class Ex04 {
    public static void main(String[] args) {
        int kor = 80;
        int eng = 100;
        int mat = 90;

        //함수 호출 grade2
        String grade = grade2(kor, eng, mat);
        System.out.println(grade);
    }public static String grade2(int kor, int eng, int mat){

        int avg = (kor + eng + mat)/3;
        String grade;
        System.out.println("평균 : " + avg);
        if(avg >= 60) {
            grade = "합격";
        }else{
            grade = "불합격";
        }return grade;

    }
}
