package TJ3;

public class CalcEx {

	public static void main(String[] args) {
		
		System.out.println(Calc.PI);
		//Calc.name("È«±æµ¿");
		Calc c1 = new Calc(); // ÀÎ½ºÅÏ½ºÈ­ 
		c1.ptint();
		c1.name("È«±æ¼ø");
		System.out.println(c1.name);
		int tot = c1.tot(100, 50);
		System.out.println("ÃÑÁ¡ : " + tot);
		System.out.println(c1.name);
		

	}

}
