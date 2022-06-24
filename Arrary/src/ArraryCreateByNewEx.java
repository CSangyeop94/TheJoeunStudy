
public class ArraryCreateByNewEx {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		// arr1이라는 배열생성 공간은 3칸(0,1,2)
		for(int i=0; i<3; i++) {
			// i는 3으로 해도되고 i<arr1.length으로 해줘도 됨
			// .length는 배열의 속성을 사용하면 나중에 코드 변경시 손이 덜갈수있음
			System.out.println("arr1[" + i +"] : " + arr1[i]);
			}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		double[] arr2 = new double[3];
		// double 타입의 배역 arr2 생성 공간은 3칸
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
		// 문자열 타입의 arr3라는 배열 생성 공간은 3칸
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

	}

}
