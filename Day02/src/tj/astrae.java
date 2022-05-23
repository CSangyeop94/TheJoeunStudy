package tj;
// 별모양 찍기
public class astrae {
    public static void main(String[] args) {

        for (int i =5; i>1; i--) {
            for(int j =1; j<-i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
