package Day;

public class Ex02 {

		private static final String String = null;

		public static void main(String[] args) {
			Grade grade = Grade.A;
			String name = grade.name();
			System.out.println(name);
			
			int ordinal = grade.ordinal();
			System.out.println(ordinal);
			
			Grade grade1 = Grade.A;
			Grade grade2 = Grade.F;
			
			int result1 = grade1.compareTo(grade2);
			int result2 = grade2.compareTo(grade1);
			
					System.out.println("A학점F : "+result1);
					System.out.println("F학점A : "+result2);
					
					
					if(args.length == 1) {
						String score = args[0];
						Grade gradeValue = Grade.valueOf(score);
						if(gradeValue == Grade.A || gradeValue == Grade.B) {
							System.out.println("좋은 점수 입니다.");
						}else {
							System.out.println("보통 이네요");
						}
							
					}
					Grade[] grades = Grade.values(); 
					for(Grade g : grades) {
						System.out.println(g);
					}
		}
}
