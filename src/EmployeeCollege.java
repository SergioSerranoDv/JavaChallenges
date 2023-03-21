import java.util.Scanner;

public class EmployeeCollege {
    Scanner scanner = new Scanner(System.in);
    String name;
    String position;
    int salary;
    int sales;
    EmployeeCollege(){
        System.out.println(" Enter the name ");

        name = scanner.next();
        System.out.println(" Enter the position in the enterprise ");
        position = scanner.next();
        System.out.println(" Enter the salary ");
        salary = scanner.nextInt();

    }
    public void showData(){
        System.out.println(" The " + position + " " + name + " is " + Integer.toString(salary));
    }
    public void payComission(){

    }
    public void payTaxes(){
        if (salary > 3_000_000){
            System.out.println("You must to pay taxes");
        }
    }
}
