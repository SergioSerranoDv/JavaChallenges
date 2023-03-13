import java.util.Scanner;
public class buyAppliance {
    Scanner scanner = new Scanner(System.in);
    int price = scanner.nextInt();
    int cuantity = scanner.nextInt();
    int total =  price * cuantity;
    public void applyDiscount(){
        if (total > 150000) {
            System.out.println("A 10% discount is applied, the value of the appliance is " + (total - total * 0.1));
        } else if (total >= 60000 && total < 150000) {
            System.out.println("A 7% discount is applied, the value of the appliance is " + (total - total * 0.07));
        }else{
            System.out.println("Don't apply discount , the value of the appliance is "+ total);
        }
    }


}

