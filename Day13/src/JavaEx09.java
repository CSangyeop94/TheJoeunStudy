
public class JavaEx09 {

	public static void main(String[] args) throws Exception{
		// throws Exception �������� �Ҷ� ���
		int num1 = 26;
		// int num2 = 0;
		int num2 = (int)((Math.random()*10)-1);
		int result = 0;
		
		
		try {
			if(num2 == 0) {
				throw new Exception("������ ���� �߻�");
				// e.getMessage() ������ �����
			}
			 result = num1 / num2;
			 
		} catch(Exception e) {
			// �޽�¡(messaging)
			System.out.println("err msg : " + e);
			System.out.println("err msg : " + e.getMessage());
			System.out.println("err msg : " + e.toString());
			e.printStackTrace();
			// ó��(patch), ���
			System.out.println("========================");
			
			// num2 = 1;
			num2 = (int)(Math.random()*10) -1 == 0? 1 :
					(int)(Math.random()*10) -1;
			result = num1 / num2;
		}
		finally {
			// �ڿ�(resource) �ݳ�(close) ex) ID stream, network
			// ������ �޼�¡
			// ����ó�� �߻��� �����ϰ� ����
		System.out.println("���� ó�� ������");
	} 
		System.out.println(result);
	}
	
}
