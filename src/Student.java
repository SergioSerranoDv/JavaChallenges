import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    Student(){
        System.out.println("Enter The name");
        name = scanner.next();
        System.out.println("Enter the age");
        age = scanner.nextInt();
    }
    public void checkAge(){
        if(age >= 18){
            System.out.println(name + " is of legal age ");
        }
    }
    public void showCredentials(){
        System.out.println(name + " is " + Integer.toString(age) + " years old" );
    }
}
