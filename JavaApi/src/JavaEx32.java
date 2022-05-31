import java.util.LinkedList;
import java.util.Queue;

public class JavaEx32 {

	public static void main(String[] args) {
		
		//FIFO(First in First out)
		Queue<String> qu = new LinkedList<>();
		qu.offer("java");
		qu.offer("phyton");
		qu.offer("JSP");
		
		for(String s : qu) {
			System.out.println(s + " ");
		} 
		System.out.println("리스트의 크기 : " + qu.size());
		
		System.out.println(qu.poll());
		System.out.println("리스트의 크기 : " + qu.size());
		System.out.println(qu.poll());
		System.out.println("리스트의 크기 : " + qu.size());
		System.out.println(qu.poll());
		System.out.println("리스트의 크기 : " + qu.size());
	}

}
