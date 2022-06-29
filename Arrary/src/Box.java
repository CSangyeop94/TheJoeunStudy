
// 제너릭 선언 <E>
// Object를 E로 변경시켜줌
public class Box<E> {
	// 필드 생성
	private E obj;
	
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	// getObj 매서드 생성
	public E getObj() {
		return obj;
	}
}
