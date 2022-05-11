import java.util.Scanner;

public class WhileEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;	int min; int max;
		System.out.println("최소치를 입력하세요");
		min = sc.nextInt();
		System.out.println("최대치를 입력하세요");
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
		    System.out.println("초기치:" + i2 + "\n" + "최대치:" + i3);
		    System.out.println("짝수의 합 : " + sum);
			System.out.println("홀수의 합 : " + sum1);
			System.out.println("총 합 : "+ (sum + sum1));
		}
		
	}
	
	
