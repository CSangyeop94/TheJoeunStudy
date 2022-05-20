
public class Person {
	static final double Tax = 0.03; // 세율
	static int salary; // 월급
	
	static int getTax() {
		return (int)(salary*Tax);
	}
	static int getTax2() {
		return (int)(salary*Tax*0.1);
	}
	
	
}
