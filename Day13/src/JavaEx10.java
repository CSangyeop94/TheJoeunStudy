
public class JavaEx10 {

	public static void main(String[] args) {
	
		// �ǹ����� ����ó�� �䱸
		// forName �޼��� ����
		// ����) public static Class(?) forName(String className)
		// throw ClassNotFoundException
		
		try {
			Class.forName("oralce.driver.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� �����ϴ�.");
			e.printStackTrace();
			// } catch (Exception e) {
		}

	}

}
