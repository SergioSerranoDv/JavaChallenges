import java.util.Scanner;
public class theLargestNumber {
    Scanner scanner = new Scanner(System.in);
    int firstNumber = scanner.nextInt();
    int secondNumber = scanner.nextInt();
    public void  comparetheNumbers() {
        if (firstNumber > secondNumber){
            System.out.println(" The largest number is: " + firstNumber);
        }else {
            System.out.println(" The largest number is: " + secondNumber);
        }
    }
}
