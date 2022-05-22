import java.util.Scanner;

public class ScannerEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("단 입력");
        a = sc.nextInt();
        for(int i =1; i<=9; i++){
            int c = a * i;
            System.out.println("구구단 : "+ a + "*" + i + "=" + c);

        }
    }
}
