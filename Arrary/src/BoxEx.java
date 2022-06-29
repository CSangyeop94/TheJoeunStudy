
public class BoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		// 문자열도 넣을수 있음 Object클래스의 후손클래스는 모두가능
//		// ex) String, Integer
//		//box.getObj();
//		// String을 넣었지만 return 은 Object형 
//		String str = (String)box.getObj();
//		// 형변환을 해줘야 합니다.
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
		// 위에랑 동일하게 형변환을 해줘야 합니다. 
		
		// 제네릭선언
		// 선언시에는 가상의 타입을 선언하고
		// 사용할때는 구체적으로 선언해주어서 사용한다.
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		// box2.setObj(3); 3을 넣을려 하면 스트링만 넣으라고 나옴
		box2.setObj("hello");
		String str = box2.getObj();
		System.out.println(str);
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
		System.out.println(v2);
	}

}
