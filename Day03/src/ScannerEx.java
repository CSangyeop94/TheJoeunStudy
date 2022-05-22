import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int Math;
        int kor;
        int avg;

        System.out.print("이름 : ");
        name = sc.next(); // nextLine()은 한줄을 다읽어옴

        System.out.print("수학점수 : ");
        Math = sc.nextInt();

        System.out.print("국어 점수 : ");
        kor = sc.nextInt();

        System.out.println("평균 점수 : ");
        avg = sc.nextInt();

        System.out.println("이름 : " + name + " " + "\n" +
                "수학 점수"+ ":" +  Math + "\n" +
                    "국어 점수 : " + kor + "\n" +
                        "평균 점수 : " + avg);
    }
}
