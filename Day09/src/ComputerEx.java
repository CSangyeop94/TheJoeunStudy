
public class ComputerEx {

	public static void main(String[] args) {
		
		int r = 10; 
		Calc calc = new Calc();
		System.out.println(calc.area1(r));
		System.out.println();
		
		// 오버라이딩
		
		Computer computer = new Computer();
		System.out.println(computer.area1(r));
		System.out.println();

	}

}
