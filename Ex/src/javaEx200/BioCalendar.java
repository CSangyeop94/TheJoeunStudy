package javaEx200;
// Math.sin(), s014.Math.toDegrees()
public class BioCalendar {
	// 상수, 상수값은 변경 불가
	public static final int PHYSICAL = 23; // 상수 정의
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = PHYSICAL;	// 변수에 상수값 대입
		int days = 1200;
		double phyval = 100*Math.sin((days % index) * 2 * Math.PI / index );
		System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);
		// %1$ <- 1$s는 첫번째 인수를 의미 = phyval
		// f는 부동 소수점 10진수로 표시해주는데 2를붙여 소수점2까지만 나오게함
	}

}
