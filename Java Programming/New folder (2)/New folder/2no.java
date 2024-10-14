import java.util.Scanner;
public class Input_Int {
    public static void main(String[] args){
        Scanner input_1 = new Scanner (System.in);
        Scanner input_2 = new Scanner (System.in);

        int num1,num2;
        int sum, sub, multi, divi;

        System.out.print("Enter number 1:");
        num1 = input_1.nextInt();
        System.out.print("Enter number 2:");
        num2 = input_2.nextInt();

        sum = num1 + num2;
        sub = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;

        System.out.println("Summation: "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+multi);
        System.out.println("Division: "+divi);

    }
}