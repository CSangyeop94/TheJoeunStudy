import java.util.List;
import java.util.Vector;

public class Ex3 {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();

		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		// Board ��ü�� ����

		list.remove(2);
		// list.add(new Board("����3", "����3", "�۾���3")); ������
		list.remove(3);
		// ��ĭ�������鼭
		// list.add(new Board("����5", "����5", "�۾���5")); �� 3���� �����ͼ� ������

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\n" + board.content + "\n" + board.writer);
			// ����1 ����1 �۾���1
			// ����2 ����2 �۾���2
			// ����4 ����4 �۾���4 ��µ�

		}

	}

}
