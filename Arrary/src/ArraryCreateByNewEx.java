
public class ArraryCreateByNewEx {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		// arr1�̶�� �迭���� ������ 3ĭ(0,1,2)
		for(int i=0; i<3; i++) {
			// i�� 3���� �ص��ǰ� i<arr1.length���� ���൵ ��
			// .length�� �迭�� �Ӽ��� ����ϸ� ���߿� �ڵ� ����� ���� ����������
			System.out.println("arr1[" + i +"] : " + arr1[i]);
			}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		double[] arr2 = new double[3];
		// double Ÿ���� �迪 arr2 ���� ������ 3ĭ
		for(int i =0; i<3; i++) {
			System.out.println("arr1[" + i +"] : " + arr1[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		// ���ڿ� Ÿ���� arr3��� �迭 ���� ������ 3ĭ
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

	}

}
