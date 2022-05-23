package vehicle;

public class DriverEx {

		public static void main(String[] args) {
			Driver driver = new Driver();
			Bus bus = new Bus();
			Taxi taxi = new Taxi();
			bus.run();
			taxi.run();
			System.out.println(bus.name);
			System.out.println(taxi.name);
			driver.drive(bus); 
			
			Vehicle v1 = new Vehicle();
			Vehicle v2 = bus;
			v2.run();
			System.out.println(v2.speed);
			v2.run();
			
		}
}
