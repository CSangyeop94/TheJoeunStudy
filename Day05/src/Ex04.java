// for���� continue ���
// 1~10 ���̸� �ݺ� �����հ� 40�� �������� i��
// sum �� ���
public class Ex04 {
	public static void main(String[] args) {
		int sum =0; int sum2=0; int cnt=0;
		for(int i=1; i<=10; i++) {
			
			if(sum<40) {
				cnt =i;
				sum +=i;
				continue;
				}
		
		}	System.out.println("sum�� : " + sum);
		System.out.println("i�� : " + cnt);
		
	}
	
}
