
public class BreakOutterEx {

	public static void main(String[] args) {
		a:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower =='g') {
					break a;
				}
			}
		}
	}

}
