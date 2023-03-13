
import java.util.Scanner;
public class Calculator {
    Scanner scanner = new Scanner(System.in);
    int firstNumber = scanner.nextInt();
    int secondNumber =  scanner.nextInt();
    public void plus(){
        int result =  firstNumber + secondNumber;
        System.out.println("The result is: " + result);
    }
}
