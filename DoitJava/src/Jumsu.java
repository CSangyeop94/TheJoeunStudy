
public class Jumsu {

	public static void main(String[] args) {
		/*
		 * . 국어, 영어 점수 대입 0~100점 사이면 총점을 출력하고
		 *  이 점수 범위가 아니면 "잘못된 점수 입력 출력"
		 */

		int kor = 100;
		int eng = 70;
		int mat = 70;
		if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || mat < 0 || mat > 100) {
			System.out.println("점수 잘못 입력");
		} else {

			System.out.println("총점 :" + (kor + eng + mat));
		}
	}

}
