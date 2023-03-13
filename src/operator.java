import java.util.Scanner;

public class operator {
    Scanner scanner = new Scanner(System.in);

    int salary =  scanner.nextInt();

    public void taxesToPay(){

        if (salary >  3000000){
            System.out.println(" Must to pay a taxes of: " + (salary*5)/100);
        }else {
            System.out.println("You should not pay taxes");
        }
    }
}

