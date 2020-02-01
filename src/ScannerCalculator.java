import java.util.Scanner;

public class ScannerCalculator {
    public static void main(String[]args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Num1: ");
        int num1 = s.nextInt();
        System.out.println();
        System.out.println("Num2: ");
        int num2 = s.nextInt();
        s.nextLine();
        System.out.println("Input operator /+*% :");
        String operatorSymbol = s.nextLine();

        int result = 0;

        if(operatorSymbol.equals("+")) {
            result = num1 + num2;
        }else if (operatorSymbol.equals("-")) {
                result = num1 - num2;
            }else if(operatorSymbol.equals("*")) {
            result = num1 * num2;
        }else if(operatorSymbol.equals("/")) {
            result = num1 / num2;
        }else if(operatorSymbol.equals("%")) {
            result = num1 % num2;
        }
        System.out.println("Test result: "+result);
    }
}
