
public class Ex01 {

	public static void main(String[] args) {
		String[] name = {"ȫ�浿", "ȫ���", "������"};
		
		int[] score = {100, 80, 70};
		int tot=0;
		
		for(int i=0; i<3; i++) {
			
			System.out.println("�̸� : "+name[i]+"\n" + "���� : "+score[i]);
			tot += score[i];	
		}
		
		double avg = (double) tot/3;
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
		

	}

}
