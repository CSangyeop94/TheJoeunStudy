package tj;

public class BooleanExample {
    public static void main(String[] args) {
       /* boolean stop = true;
        if(stop) {
            System.out.println("중지합니다.");
        }else {
            System.out.println("시작합니다.");
        }*/
        String name;


        name = "추상엽";
        int kor = 80;
        int eng = 80;
        int mat = 80;
        int totalScore = kor + eng + mat;
        double average = totalScore/3;

         char grade;
         if (average >= 80) {
              grade = 'P';
            }else {
              grade = 'F';
          }


        System.out.println("이름 : " + name);
        System.out.println("kor점수 : " + kor);
        System.out.println("eng점수 : " + eng);
        System.out.println("mat점수 : " + mat);
        System.out.println("총점수 : " + totalScore);
        System.out.println("평균점수 : " + average);
        System.out.println("총평 : " + grade);

        /*if(average >= 80) {
            System.out.println("총평 : "+ 'P');
        }else{
            System.out.println("총평 : "+ 'F');
        }
*/
    }
}
