
public class ArEx {

	public static void main(String[] args) {
		// 배열생성
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		// 작성 위치 1)총점을 구하시오 .2) 평균을 구하시오
		// for문 사용
		for(int i =0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System .out .println("array ["+i+" J ["+j+" ] =" 
						+array[i][j]);
				sum += array[i][j];
				
			}
			
		}
		System.out.println("배열 0번쨰 길이 :"+array[0].length);
		System.out.println("배열 1번쨰 길이 :"+array[1].length);
		System.out.println("배열 2번쨰 길이 :"+array[2].length);
		int scores = array[0].length + array[1].length + array[2].length;
		avg = sum/scores;
		//
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
