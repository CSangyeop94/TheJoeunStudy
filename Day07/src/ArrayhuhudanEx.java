
public class ArrayhuhudanEx {
	
	public static void main(String[] args) {
		int[][] gugudan = new int[8][9]; 
		//for(int i =0; i<8; i++) 
		for(int i=0; i<gugudan.length; i++){
			//열
			System.out.println((i+2)+"단");
			//for(int j =0; j<9; j++) 
			for(int j=0; j<gugudan[i].length; j++){
				// gugudan 0행에대한 9열 -- 1행에대한 9열 .......
				gugudan[i][j] = (i+2) * (j+1);
				System.out.println((i+2)+" * "+(j+1)+"="+
				gugudan[i][j]);
			}
		}
	}
}
