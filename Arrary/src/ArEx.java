
public class ArEx {

	public static void main(String[] args) {
		// �迭����
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		// �ۼ� ��ġ 1)������ ���Ͻÿ� .2) ����� ���Ͻÿ�
		// for�� ���
		for(int i =0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System .out .println("array ["+i+" J ["+j+" ] =" 
						+array[i][j]);
				sum += array[i][j];
				
			}
			
		}
		System.out.println("�迭 0���� ���� :"+array[0].length);
		System.out.println("�迭 1���� ���� :"+array[1].length);
		System.out.println("�迭 2���� ���� :"+array[2].length);
		int scores = array[0].length + array[1].length + array[2].length;
		avg = sum/scores;
		//
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
