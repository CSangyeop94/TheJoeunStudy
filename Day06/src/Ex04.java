public class Ex04 {

	public static void main(String[] args) {
		int[] aa= new int[10];
		int[] bb=new int[10];
		// 입력부분
		for(int i=0;i<aa.length;i++) {
			aa[i]=i+1;
		}
		
		for(int i=0;i<bb.length;i++) {
			bb[i]=aa[(aa.length-1)-i];
			// aa의 배열길이가 10 그러므로 (10-1)-0 -> 10-1 -1
			// 10.9.8.7.....
		}
		// 출력부분
		System.out.println("aa 배열 :");
		for(int i=0;i<aa.length;i++) {
			System.out.print(aa[i] + ",");
		}
		System.out.println();
		System.out.println("bb 배열 :");
		for(int i=0;i<bb.length;i++) {
			System.out.print(bb[i] + ",");
		}
		
	}
}