
public class Ex01 {

	public static void main(String[] args) {
		String[] name = {"È«±æµ¿", "È«±æ¼ø", "°­°¨Âù"};
		
		int[] score = {100, 80, 70};
		int tot=0;
		
		for(int i=0; i<3; i++) {
			
			System.out.println("ÀÌ¸§ : "+name[i]+"\n" + "Á¡¼ö : "+score[i]);
			tot += score[i];	
		}
		
		double avg = (double) tot/3;
		System.out.println("ÃÑÁ¡ : " + tot);
		System.out.println("Æò±Õ : " + avg);
		

	}

}
