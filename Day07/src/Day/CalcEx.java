package Day;

public class CalcEx {

	public static void main(String[] args) {
		Calc c1 = new Calc();
		
		c1.add = 100; c1.divide = 200;
		
		System.out.println(c1.add);
		System.out.println(c1.divide);
		
		c1.ptint();
		
		int add1 =c1.add1(10,20);
		System.out.println("더하기 : " + add1);
		
		String odd = c1.odd(10);
		System.out.println("값 : "+c1.su + "\n결과 : "+odd);
		

	}

}
