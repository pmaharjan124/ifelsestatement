import java.util.Scanner;
public class IfElseStatement {


    public static void main(String[] args) {
        int number = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextLine();

        if (number > 0) {
            System.out.println("Number is positive.");
        }else if (number < 0) {
            System.out.println("Number is not positive.");
        }
         else{
            System.out.println("Application finished.");
        }
    }
}
