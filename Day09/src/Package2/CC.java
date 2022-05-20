package Package2; 
import com.Package1.*;


public class CC {

	public static void main(String[] args) {
		AA a = new AA("ȫ�浿",100, 50);
		a.getCalc();
		int result = a.getNum(100);
		System.out.println(result);
		
	}

}
