import java.util.Scanner;

public class CalcEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		Calc calc=new Calc(100,80,90);
		Calc calc2=new Calc("admin","1111");
		while(true) {
			System.out.println("�޴� : 1. ������ 2. ����ó�� 3. ���̵� üũ 0.����");
			num = sc.nextInt();
			if(num == 1) {
				calc.gugudan();
				
			}else if(num == 2) {
				;
				calc.sungjuk();
			}else if(num == 3) {
				
				calc2.idCheck();
			}else if(num == 0) {
				System.out.println("�޴� ����");
				break;
			}
		}
		}
	

	
}
/*
 * public static void main(String[] args) { Calc c1 = new Calc(); c1.excute();
 * 
 * }
 */