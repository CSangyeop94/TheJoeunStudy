import java.util.Stack;

public class JavaEx33 {
	
	public static void main(String[] args) {
		
		// LIFO ���� <Last in First out>
		Stack<String> stack = new Stack<>();
		stack.push("java");
		stack.push("phyton");
		stack.push("JSP");
		
		System.out.println("stack�� ũ�� : " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("stack�� ũ�� : " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("stack�� ũ�� : " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("stack�� ũ�� : " + stack.size());
		// ���߿� �� ���� ���� ������ ������
		// stack�� ũ�� : 3
		// JSP
		// stack�� ũ�� : 2
		// phyton
		// stack�� ũ�� : 1
		// java
		// stack�� ũ�� : 0
		// ����� �̷��� ���´�.

		
	}
}
