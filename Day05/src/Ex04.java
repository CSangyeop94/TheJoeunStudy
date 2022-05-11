// for문과 continue 사용
// 1~10 사이를 반복 누적합계 40이 넘을떄의 i값
// sum 값 출력
public class Ex04 {
	public static void main(String[] args) {
		int sum =0; int sum2=0; int cnt=0;
		for(int i=1; i<=10; i++) {
			
			if(sum<40) {
				cnt =i;
				sum +=i;
				continue;
				}
		
		}	System.out.println("sum값 : " + sum);
		System.out.println("i값 : " + cnt);
		
	}
	
}
