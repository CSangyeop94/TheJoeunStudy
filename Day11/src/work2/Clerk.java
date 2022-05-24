package work2;

public class Clerk implements Director{
	
	
	@Override
	public void orderFromPresident() {
		// Director.super.orderFromPresident();
		System.out.println("사원이 회장님 지시대로 일하다.");
	}

}
