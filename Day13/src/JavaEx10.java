
public class JavaEx10 {

	public static void main(String[] args) {
	
		// 의무적인 예외처리 요구
		// forName 메서드 원형
		// 이유) public static Class(?) forName(String className)
		// throw ClassNotFoundException
		
		try {
			Class.forName("oralce.driver.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버가 없습니다.");
			e.printStackTrace();
			// } catch (Exception e) {
		}

	}

}
