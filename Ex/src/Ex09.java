import java.util.ArrayList;
import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("(1~10)������ �Է��� �ο����� �Է����ּ��� : ");
		i = sc.nextInt();
		// ������
		String subject[] = {"����","����","����"};
		// �л���
		int student[] = new int[i];
		// ������ ���� �迭
		int jumsu[] = new int[3];
		try{
			if(0>=i && i>10) {	
				System.out.println(i+"�� �Դϴ�.");
			}else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			}
		}catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
		}
		int length = student.length;
		System.out.println(length + "�� �Դϴ�.");
		System.out.println("�޴��� �������ּ���");
		System.out.println("1�� ������� 2�� ���� ��Ȳ 3�� ���� �Ѱ� ��Ȳ");
		
		String name = null;
		int tot = (jumsu[0]+jumsu[1]+jumsu[2]); 
		double avg = tot/3.0;
		while(true) {
			int num = sc.nextInt();
			if(num == 1) {
				for(int j=0; j<student.length; j++) {
					System.out.println("�̸���?");
					name = sc.next();
					System.out.println("kor ������ �Է����ּ���");
					jumsu[0] = sc.nextInt();
					System.out.println("eng ������ �Է����ּ���");
					jumsu[1] = sc.nextInt();
					System.out.println("mat ������ �Է����ּ���");
					jumsu[2] = sc.nextInt();
					System.out.println("�̸� : " + name +"\n"+ subject[0] + jumsu[0]+"\n"+
							subject[1] + jumsu[1]+"\n"+ subject[2] + jumsu[2]+"\n"+"tot : " + tot
							+"\n"+"avg : " + avg);
					}
				
			}
		}
	}
}
