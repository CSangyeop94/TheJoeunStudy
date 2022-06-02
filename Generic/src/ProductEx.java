
public class ProductEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv, String> pr1 = new Product<Tv, String>();
		pr1.setKind(new Tv());
		pr1.setModel("½º¸¶Æ®Tv");
		Tv tv = pr1.getKind();
		
		Product<Car, String> pr2 = new Product<Car, String>();
		pr2.setKind(new Car());
		pr2.setModel("µðÁ©");
		Car car = pr2.getKind();
		String carModel = pr2.getModel();
		
	}

}
