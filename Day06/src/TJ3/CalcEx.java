package TJ3;

public class CalcEx {

	public static void main(String[] args) {
		
		System.out.println(Calc.PI);
		//Calc.name("ȫ�浿");
		Calc c1 = new Calc(); // �ν��Ͻ�ȭ 
		c1.ptint();
		c1.name("ȫ���");
		System.out.println(c1.name);
		int tot = c1.tot(100, 50);
		System.out.println("���� : " + tot);
		System.out.println(c1.name);
		

	}

}
