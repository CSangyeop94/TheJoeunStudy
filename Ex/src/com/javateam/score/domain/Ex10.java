package com.javateam.score.domain;

public class Ex10 {

	/**
	 * �Ҽ��� n��° �ڸ����� �ݿø��ϴ� ��� ȯ��
	 *  
	 * @param avg ���
	 * @param n �ݿø��� �Ҽ��� n�ڸ�
	 * @return �ݿø��� ���
	 */
	static float getRoundAvg(float avg, int n) {
		
		float power = (float)Math.pow(10, n-1); 
		return (float)Math.round(avg * power) / power;
	}
	
	/**
	 * ������� �Է��ϸ� Ư�� ���� ���� ���(�Ҽ��� n�ڸ����� �ݿø��� ���)�� ȯ��
	 *  
	 * @param subjectName ����� ex) ����
	 * @param subjectArr ex) ��ü �ο� ���� ��Ȳ �迭 
	 * @param n �ݿø��� �Ҽ��� n�ڸ�
	 * @return ���� ���
	 */
	static float getTotalAvg(String subjectName, SubjectDTO[] subjectArr, int n) {
	
		int totSum = 0;
		int num = subjectArr.length;
		
		for (int i = 0; i < num; i++) {
			
			if (subjectName.equals("����"))
				totSum += subjectArr[i].getKorean();
			else if (subjectName.equals("����"))
				totSum += subjectArr[i].getEnglish();
			else if (subjectName.equals("����"))
				totSum += subjectArr[i].getMath();
		} //
		
		return getRoundAvg((float)totSum/num, n);
	}

	public static void main(String[] args) {

		// ��/��/�� ���� : 0 ~ 100 ����
		
		/** ���� */
		byte korean = -1; // ����
		/** ���� */
		byte english = -1; // ����
		/** ���� */
		byte math = -1; // ����
		
		/* --------------- �ټ� �ο� �� �Է� �� --------------- */
		
		// TODO
		// 1~10����� �Է��� �� �ֵ��� ���� ��ġ
		// ���� ó�� �޽��� : 1~10�� ���̷� �ο����� �Է��Ͻʽÿ�. 
		// "exit"(��ҹ��� ���� ���� ��) �Է��ϸ� �б�/�ý��� �����ϵ��� ��ġ.
		Scanner sc = null;
		String str;
		
		while (true) {
			
			System.out.print("������ �Է��� �ο����� �Է��Ͻʽÿ� : ");
			sc = new Scanner(System.in);
			str = sc.nextLine();
			
			if (str.trim().equalsIgnoreCase("exit")){
				
				System.out.println("�Է��� �����մϴ�.");
				System.exit(0);
			} // 
			
			// TODO
			// 1) 1~10 ������ ���� ���ڿ��� ������ �� �ִ� ����ǥ����(regex)�� �ϼ��Ͻʽÿ�.
			// ���Խ��� ���ǿ� ������ �ݺ������� �б��ϰ�(���� ������)
			// �׷��� ������ "1~10�� ���̷� �ο����� �Է��Ͻʽÿ�." ��� 
			// �޽����� ����ϵ��� �ۼ��մϴ�.
			
		} // while (�ο��� �Է�)
		
		int num = Integer.parseInt(str.trim());
		
		System.out.println("���� �Է� �ο��� : " + num);
		
		/* -------------- ��/��/�� (�Էº�) ---------------- */
		
		// ��/��/�� ���� ���� ������ �Ʒ��� ���� �� �ٷ� �Է��� �� �ֵ��� ���ǰ� ���� �ۼ��մϴ�.
		String subjects[] = null; // ����� �迭
		
		// TODO
		// 2) �̹� �ۼ��� ���� ó�� �ڹٺ�(SubjectDTO)��ü�� ���� ��ҷ� �ϰ� 
		// �Էµ� �ο����� ũ��� �ϴ� �迭 ���� subjectArr�� �ۼ��Ͻʽÿ�.
		// : �ټ� �ο� ������ ���� �� �ִ� �迭 ����
		SubjectDTO[] subjectArr = new SubjectDTO[num];
		
		// TODO
		// 3) �ο��� ��ŭ �ݺ� �Է��� �� �ֵ��� ��ġ
		// hint) �ο��� ���� ���� �� for loop Ȱ��
		
			System.out.println("\n----------------------------------------------------------\n");
		
			while (true) {
				
				System.out.print("��/��/�� ���� ������ �Է��Ͻʽÿ� : ");
				sc = new Scanner(System.in);
				str = sc.nextLine();
				
				if (str.trim().equalsIgnoreCase("exit")){
					
					System.out.println("�Է��� �����մϴ�.");
					System.exit(0);
				} // 
				
				// 0~100 ������ ���� ���ڿ�
				String intRange = "([0-9]|[1-9][0-9]|100)";
				String regex = intRange + "\\s{1,}" + intRange + "\\s{1,}" + intRange;
				
				if (Pattern.matches(regex, str.trim()) == false) {
					
					System.out.println("0~100������ ���������� 3���� �������� �Է��Ͻʽÿ�.");
					
				} else {
					
					subjects = str.trim().split("\\s{1,}");
					korean = Byte.parseByte(subjects[0]);
					english = Byte.parseByte(subjects[1]);
					math = Byte.parseByte(subjects[2]);
					break;
				} //
				
			} // while
			
			// ���� ��Ȳ => DTO ����(SubjectDTO.java)
			SubjectDTO subjectDTO = new SubjectDTO(korean, english, math);
			
			System.out.println();
			System.out.printf("���� ���� : %d ��, ", subjectDTO.getKorean());
			System.out.printf("���� ���� : %d ��, ", subjectDTO.getEnglish());
			System.out.printf("���� ���� : %d ��\n", subjectDTO.getMath());
			System.out.println();
			
			/* -------------- ���� ���� ����(���) --------------  */

			subjectDTO.setSum(subjectDTO.getSum());
			
			/* -------------- ���� ��� ����(���) --------------  */
			
			// �Ҽ��� 2�ڸ����� �ݿø��Ͽ� ��� ȯ��
			System.out.print("���(�Ҽ��� ������) : " + subjectDTO.getAvg() + ", ");
			float avg = subjectDTO.getAvg(subjectDTO.getAvg(), 2);
			
			System.out.println("���(�Ҽ��� ������) : " + avg);
			System.out.println();
			
			System.out.println(subjectDTO);
			
			// ���� �ο� ���� ��Ȳ �߰�
			subjectArr[i] = subjectDTO;
		
		sc.close();
		
		/* -------------- ��ü �ο��� ���� ���� ��Ȳ �μ� --------------  */
		
		System.out.println("\n--------------------- ��ü �ο� ���� ���� ��Ȳ --------------------\n");
		
		// TODO
		// 4) �Ʒ��� ���� �������� ��µ� �� �ֵ��� �ڵ带 �ۼ��Ͻʽÿ�.
		// ��� ����) 
		// �л� ���� ���� ��Ȳ : ����=70, ����=80, ����=100, ����=250, ���=83.3
		//
		// 					...(�߷�)...
		//
		// �л� ���� ���� ��Ȳ : ����=77, ����=65, ����=89, ����=231, ���=77.0
		
		
		/* -------------- ��ü �ο��� ���� �Ѱ� ��Ȳ �μ� --------------  */
		
		System.out.println("\n--------------------- ��ü �ο� ���� �Ѱ� ��Ȳ --------------------\n");		
		
          		
		// TODO
		// 5) Ŭ���� ���ο� ���õ� getTotalAvg �޼��带 Ȱ���Ͽ� �� ������ ����� �Ʒ��� ���� �μ��� �� �ֵ���
		// �ڵ带 �ۼ��Ͻʽÿ�.
		// 
		//--------------------- ��ü �ο� ���� �Ѱ� ��Ȳ --------------------
		//	
		//	��ü �ο� ���� ��� : 78.3
		//	��ü �ο� ���� ��� : 70.0
		//	��ü �ο� ���� ��� : 94.7
		
		
	} //
}
