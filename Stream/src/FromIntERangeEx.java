import java.util.stream.IntStream;

public class FromIntERangeEx {
	public static int sum;
	
	public static void main(String[] args) {
		// 1~100������ �ձ��ϱ�
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("���� : " + sum);
		
		// ���� : 5050 ���
	}
}
