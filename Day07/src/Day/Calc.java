package Day;

public class Calc {
	int add=10;
	int divide=20;
	int su;
	
	int add1 (int x, int y) {
		
		int tot = x + y;
		return tot;
	}
	public String odd(int su1) {
		this.su = su1;
		String result;
		if(su1%2 ==0) {
			result = "¦���Դϴ�.";
		}else {
			result = "Ȧ���Դϴ�.";
		}
		
		return result;
	}
	public void ptint() {
		
		System.out.println("divide�� =" +divide);
		System.out.println("add�� = "+add);
		
	}
	
	
	
}

