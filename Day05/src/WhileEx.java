import java.util.Scanner;

public class WhileEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;	int min; int max;
		System.out.println("�ּ�ġ�� �Է��ϼ���");
		min = sc.nextInt();
		System.out.println("�ִ�ġ�� �Է��ϼ���");
		max = sc.nextInt();
		int sum=0; int sum1 =0;
		int i2 = min;
		int i3 = max;
		while(min<=max){
		
				if(min%2 ==0) {
					sum +=  min;
					
				}
				else{
					sum1 +=  min;
				}			
				min++;
			
		
			
			}
		    System.out.println("�ʱ�ġ:" + i2 + "\n" + "�ִ�ġ:" + i3);
		    System.out.println("¦���� �� : " + sum);
			System.out.println("Ȧ���� �� : " + sum1);
			System.out.println("�� �� : "+ (sum + sum1));
		}
		
	}
	
	
