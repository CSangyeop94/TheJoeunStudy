import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//
		
		
		
		while(true) {
			System.out.println("�޴� ����" + "\n" 
		+ "1. ������"+ "\n" 
					+ "2.id check"+ "\n"
		+ "3.������" + "\n"
					+ "4.����");
			int cnt = sc.nextInt();
			
			
			if(cnt ==1) {
				System.out.println("������");
				int num; int j;
				System.out.println("���� �Է� ���ּ���");
				num = sc.nextInt();
				for(int i=0; i<=9; i++) {
					System.out.println(num + "��" + num + "*" + i + "=" + (num*i));
					
					/*�Լ� ����
					 * �Լ�ȣ��
					 * �Լ��̸�(); = gugudan();*/
				}
				
			}else if(cnt ==2) {
				System.out.println("id check");
				String id; String pw;
				System.out.println("id�� �Է����ּ���");
				id = sc.next();
				System.out.println("pw�� �Է����ּ���");
				pw = sc.next();
				if(id.equals("admin")) {
					System.out.println("��й�ȣ�� �Է����ּ���");
					if(pw.equals("1111")) {
						System.out.println("���� �Ǿ����ϴ�.");
					}else {
						System.out.println("��й�ȣ�� �߸��Ǿ����ϴ�.");
					}
				}else {
					System.out.println("���� ���� �ʴ� ���̵��Դϴ�.");
				}
				// System.out.println(idcheck()); - ���ϰ��� ���
				// String id = idcheck(); -- ���ϰ��� ������ �ֱ�
				// System.out.println(idcheck()); --> ��ȭ�� �������� ���
				// System.out.println(id);
				
			}else if(cnt ==3) {
				System.out.println("������");
				int num;	int num1=0;
				//System.out.println("�����Է� ���ּ���");
				//num = sc.nextInt();
				for(num=0; num<=100; num++) {
					if(num%2 ==0) {
						num1 += num;
						
					}
				}System.out.println("1~100������ ¦���� �� : " + num1); 
				
			}else if(cnt ==4) {
				System.out.println("����");
				break;
			}
		}
		
		
		/*
		 * int i = 0; int sum =0; int j; while(true) { //1~5������ ���� ������ break;�� ���������� sum
		 * += i; i++; if(i>5) { break; } } System.out.println("1����5������ �� : " + sum);
		 * 
		 */
			
			}
	
		// Ŭ���� �ȿ� �� Scanner�� Ŭ���� �ȿ����� �۵�
		// �Լ� ���� �ٽ��ѹ� Scanner ����
		public static void gugudan() {//void�� ���ϰ��� ���� 
			for(int i=1; i<=9; i++) {
				System.out.println(i);
			}
		}
		public static String idcheck() {
			Scanner sc = new Scanner(System.in); // �ٽ� �����ؼ� ���
			System.out.println("id�Է�:");
			String id = sc.next(); //Ŭ������ �����ѰŶ� sc��� ���������� �۵��̾ȵ�
			return id;
		}
	}


