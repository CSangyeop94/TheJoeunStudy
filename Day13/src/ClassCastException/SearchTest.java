package ClassCastException;

public class SearchTest {

	/**
	 * 검색할 대상 문장에서 특정 검색어의 개수를 반환하는 메서드
	 * 
	 * @param target     검색할 문장
	 * @param searchWord 검색어
	 * @return 검색어 개수
	 */
	public static int getCountBySearchWord(String target, String searchWord) {

		int count = 0;
		// 카운터 변수를 작성하여 초기화합니다
		String words[] = target.split(" ");
		// .split 문자열을 분활 해주는 메서드

		// 검색의 대상이 되는 문장(target)을 한 단어씩 "분리"합니다.
		for (int i = 0; i < words.length; i++) {
			// 반복문(for)을 활용하여 단어 속에 검색어가 "포함"되어 있는지
			if (words[i].trim().contains(searchWord) == true)
				// .trim() 공백을 지우는 메서드
				// .contains
				// 이 문자열 내에서 지정한 하위 문자열이 발생하는지를 나타내는 값을 반환합니다.
				count++;
			// 여부를 점검하여 있으면 카운터를 증가시킵니다.
		}
		// 전체적으로 누적된 카운터 변수를 리턴(반환)합니다.
		return count;
	}

	public static void main(String[] args) {

		String sentence = "클라우드 컴퓨팅(영어: cloud computing)은 " + "클라우드(인터넷)을 통해 가상화된 컴퓨터의 시스템리소스(IT 리소스)를 "
				+ "요구하는 즉시 제공(on-demand availability)하는 것이다. " + "인터넷 기반 컴퓨팅의 일종으로 정보를 자신의 컴퓨터가 아닌 클라우드(인터넷)에 "
				+ "연결된 다른 컴퓨터로 처리하는 기술을 의미한다. 공유 컴퓨터 처리 자원과 데이터를 "
				+ "컴퓨터와 다른 장치들에 요청 시 제공해준다. 구성 가능한 컴퓨팅 자원(예: 컴퓨터 네트워크, " + "데이터 베이스, 서버, 스토리지, 애플리케이션, 서비스, 인텔리전스)에 대해 "
				+ "어디서나 접근할 수 있는, 주문형 접근(on-demand availability " + "of computer system resources)을 가능케하는 모델이며 "
				+ "최소한의 관리 노력으로 빠르게 예비 및 릴리스를 가능케 한다. 클라우드 컴퓨팅과 " + "스토리지 솔루션들은 사용자와 기업들에게 개인 소유나 타사 데이터 센터의 데이터를 저장, "
				+ "가공하는 다양한 기능을 제공하며 도시를 거쳐 전 세계로까지 위치해 있을 수 있다. " + "클라우드 컴퓨팅은 전기망을 통한 전력망과 비슷한 일관성 및 규모의 경제를 달성하기 위해 "
				+ "자원의 공유에 의존한다.";

		// System.out.println(getCountBySearchWord(sentence, "클라우드"));
		System.out.println(getCountBySearchWord(sentence, "컴퓨팅"));

	} //

}
