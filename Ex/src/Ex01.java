import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		// ����
		// 0. ��ȣ�� �Է����ּ���
		// (1.������� 2.������ 3.���̵� üũ)
		// if������ ����
		Scanner sc = new Scanner(System.in);
		
		int kor; int eng; int mat; 
		String name;
		String id =null; String pw = null;
		System.out.println("��ȣ�� �Է����ּ���");
		System.out.println("0.�ý��� ����" + "\n"
				+"1. ���� ���"+ "\n"+
				"2. ������"+ "\n"+
				"3. ���̵� üũ");
		int num = sc.nextInt();
		if(num != 0) {
			if(num == 1) {
				System.out.println("�̸���?");
				name = sc.next();
				System.out.println("kor ������ �Է����ּ���");
				kor = sc.nextInt();
				System.out.println("eng ������ �Է����ּ���");
				eng = sc.nextInt();
				System.out.println("mat ������ �Է����ּ���");
				mat = sc.nextInt();
				int tot = kor+eng+mat; 
				double avg = tot/3.0;
				System.out.println("�̸� : " + name);
				System.out.println("kor : " + kor);
				System.out.println("eng : " + eng);
				System.out.println("mat : " + mat);
				System.out.println("tot : " + tot);
				System.out.println("avg : " + avg);
				
					}
			else if (num == 2) {
				System.out.println("dan �� �Է����ּ���");
				int dan = sc.nextInt();
				for(int i =1; i<10; i++) {
					System.out.println(dan+"dan");
					System.out.println(dan+"*"+i+ "="+(dan*i));
				}
			}
			else if (num == 3) {
				System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
				if(id.equals("admin") && pw.equals("1234")) {
					System.out.println("���� �Ǿ����ϴ�.");
				}else {
					System.out.println("���� �����Ͽ����ϴ�.");
				}
			}
		}else {
			System.out.println("�ý����� ����˴ϴ�");
		}
		
		
		
	}

}
