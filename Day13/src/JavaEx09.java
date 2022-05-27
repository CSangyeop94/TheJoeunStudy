
public class JavaEx09 {

	public static void main(String[] args) throws Exception{
		// throws Exception 블럭단위로 할때 사용
		int num1 = 26;
		// int num2 = 0;
		int num2 = (int)((Math.random()*10)-1);
		int result = 0;
		
		
		try {
			if(num2 == 0) {
				throw new Exception("나누기 오류 발생");
				// e.getMessage() 내용이 변경됨
			}
			 result = num1 / num2;
			 
		} catch(Exception e) {
			// 메시징(messaging)
			System.out.println("err msg : " + e);
			System.out.println("err msg : " + e.getMessage());
			System.out.println("err msg : " + e.toString());
			e.printStackTrace();
			// 처리(patch), 대용
			System.out.println("========================");
			
			// num2 = 1;
			num2 = (int)(Math.random()*10) -1 == 0? 1 :
					(int)(Math.random()*10) -1;
			result = num1 / num2;
		}
		finally {
			// 자원(resource) 반납(close) ex) ID stream, network
			// 마무리 메세징
			// 예외처리 발생과 무관하게 실행
		System.out.println("예외 처리 마무리");
	} 
		System.out.println(result);
	}
	
}
