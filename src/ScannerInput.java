import java.util.Scanner;

public class ScannerInput {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        s.nextLine();
        System.out.println("Enter your name: ");
        String name = s.nextLine();

        System.out.println("Your number is: "+num);
        System.out.println("Your name is: "+name);

    }
}
