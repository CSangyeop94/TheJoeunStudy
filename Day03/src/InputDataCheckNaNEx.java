public class InputDataCheckNaNEx {
    public static void main(String[] args) {

        String userInput = "Nan";
        double val = Double.valueOf(userInput);


        double currentBalance = 10000.0;

        if(Double.isNaN(val) || Double.isInfinite(val)) {
            System.out.println("값을 산출할 수 없음");
            val = 0.0;
        }
        currentBalance += val;
        System.out.println(currentBalance);
    }
}
