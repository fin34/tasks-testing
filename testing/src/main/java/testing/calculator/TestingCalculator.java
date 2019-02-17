package testing.calculator;

public class TestingCalculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;

        if(calculator.add(a, b) == 8){
            System.out.println("Test OK");
        }else {
            System.out.println("Error");
        }

        if(calculator.subtract(a, b) == 2){
            System.out.println("Test OK");
        }else {
            System.out.println("Error");
        }
    }
}
