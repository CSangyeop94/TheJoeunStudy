import java.util.Stack;

public class JavaEx33 {
	
	public static void main(String[] args) {
		
		// LIFO 구조 <Last in First out>
		Stack<String> stack = new Stack<>();
		stack.push("java");
		stack.push("phyton");
		stack.push("JSP");
		
		System.out.println("stack의 크기 : " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("stack의 크기 : " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("stack의 크기 : " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("stack의 크기 : " + stack.size());
		// 나중에 들어간 값이 먼저 나가는 구조라서
		// stack의 크기 : 3
		// JSP
		// stack의 크기 : 2
		// phyton
		// stack의 크기 : 1
		// java
		// stack의 크기 : 0
		// 출력이 이렇게 나온다.

		
	}
}
