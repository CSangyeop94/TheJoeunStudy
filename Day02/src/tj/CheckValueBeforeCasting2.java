package tj;

public class CheckValueBeforeCasting2 {
    public static void main(String[] args) {
        int i = 126;

        if((i<Byte.MIN_VALUE || i>Byte.MAX_VALUE)) {
            System.out.println("byte 타입으로 변환할 수 없음");
            System.out.println("값을 다시 확인");
        } else {
            byte b = (byte) i;
            System.out.println(b);
        }
        String grade;
        String name;
        name = "멍청이";
        int kor = 80;
        int eng = 80;
        int mat = 39;
        int tot = kor + eng + mat;
        double avg = tot/3;

       /* if(kor>=40 && eng>=40 && mat>=40){
            if (avg > 60) {
                grade = "합격";
            } else {
                grade = "불합격";
            }
        } else {
            grade = "불합격";
        }*/
        if(avg >= 60 && kor>=40 && eng>=40 && mat>=40){
            grade = "합격";
        }else{
            grade = "불합격";
        }
        System.out.println("이름 : "+ name);
        System.out.println("총점 : " + tot);
        System.out.println("평균 : " + avg);
        System.out.println("합격여부 : " + grade);



    }
}
