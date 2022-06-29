package javaEx200;
// non static 메서드(맴버)
public class BioCalendar02 {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23; 
	// static 변수 생성 없이 사용
	// 맴버 메서드(non static) 메서드 선언
	public double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days % index)*2 * Math.PI / index);
	} 
	//Math.sin() 메소드는 인수로 전달받은 값의 사인(sine) 함숫값을 반환합니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 1200;
		BioCalendar02 bio = new BioCalendar02(); // 객체를 생성
		// 맴버 메서드 호출
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체지수 %1$.2f입니다.\n", phyval);
	}

}
