package example;

import java.util.Scanner;

public class CheckEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("id �Է�");
		String id = sc.next();
		System.out.println("pw �Է�");
		String pw = sc.next();
		// �θ� Ŭ����
		Check check1 = new Check(id, pw);
		check1.Idc(check1); // check1 �� �ּҹ����� �ѱ�
		//�ڽ� Ŭ���� �Ű� ���� (Ŭ���� ����) �����ؼ� �θ�Ÿ������ �ڵ� ����ȯ
		
		Check check2 = new IdCheck(id, pw);
		check2.Idc(check2); // ���� ����
		//�ʵ�� �������� �޼ҵ�� �����ǰ� ������
	
		
		
		
		
		

	}

}
