package package100;

import java.util.Scanner;

public class SungEx {

	public static void main(String[] args) {
		int num;
		String[] name=new String[3];
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] mat=new int[3];
		int[] tot=new int[3];
		double[] avg=new double[3];
		String[] grade=new String[3];
		String id ;String pw;
		Scanner sc=new Scanner(System.in);
		while(true) {
	System.out.println("�޴� 1. ���� �Է� 2. ���� ���  3. �հݿ��� 4.���̵�üũ 5. ����");
	num=sc.nextInt();
	
	if(num==1) {
		
		for(int i=0;i<3;i++) {
		System.out.println("�̸� :");
		name[i]=sc.next();
		System.out.println("�������� :");
		kor[i]=sc.nextInt();
		System.out.println("�������� :");
		eng[i]=sc.nextInt();
		System.out.println("�������� :");
		mat[i]=sc.nextInt();
		Sung sung=new Sung(name[i],kor[i],eng[i],mat[i]);
		tot[i]=sung.getTot();
		avg[i]=sung.getAvg();
		grade[i]=sung.getGrade();
		}
		
	}else if(num==2) {
		
		for(int i=0;i<3;i++) {
			System.out.println("�̸� :" + name[i]);
			System.out.println("�������� : " + kor[i]);
			System.out.println("�������� : " + eng[i]);
			System.out.println("�������� :" + mat[i]);
		}
	}else if(num==3) {
		for(int i=0;i<3;i++) {
			System.out.println("�̸� :" + name[i]);
			System.out.println("���� :" + tot[i]);
			System.out.println("��� : " + avg[i]);
			System.out.println("�հݿ��� : " + grade[i]);
		}
	}else if(num==4) {
		System.out.println("���̵� :");
		id=sc.next();
		System.out.println("��ȣ :");
		pw=sc.next();
		Sung sung=new Sung();
		sung.idCheck(id, pw);
	}else {
		break ;
			}
		}
	}
}