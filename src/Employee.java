import java.util.Scanner;

public class Employee {
    Scanner scanner = new Scanner(System.in);
    String name;
    String position;
    int salary;

    Employee() {
        name = scanner.next();
        position = scanner.next();


    }
    public void checkSalary(){
        switch (position){
            case "executive":
                salary = 8_000_000;
                break;
            case "specialist":
                salary = 6_500_000;
                break;
            case "professional":
                salary = 5_500_000;
                break;
            case "assistant":
                salary = 3_000_000;
                break;
            default:
                System.out.println("The position don't exist ");

        }
        System.out.println(" The " + position + " " + name + " obtain a salary of " + Integer.toString(salary)  );
    }
}
