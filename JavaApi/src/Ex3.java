import java.util.List;
import java.util.Vector;

public class Ex3 {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();

		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		// Board 객체를 저장

		list.remove(2);
		// list.add(new Board("제목3", "내용3", "글쓴이3")); 삭제됨
		list.remove(3);
		// 한칸떙겨지면서
		// list.add(new Board("제목5", "내용5", "글쓴이5")); 이 3으로 내려와서 삭제됨

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\n" + board.content + "\n" + board.writer);
			// 제목1 내용1 글쓴이1
			// 제목2 내용2 글쓴이2
			// 제목4 내용4 글쓴이4 출력됨

		}

	}

}
