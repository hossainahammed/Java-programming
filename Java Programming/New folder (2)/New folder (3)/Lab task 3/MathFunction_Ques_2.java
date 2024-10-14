
package week.pkg3;
import java.util.Scanner;

public class MathFunction_Ques_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        double max = Math.max(num1, Math.max(num2, num3));
        double min = Math.min(num1, Math.min(num2, num3));

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        
    }
    
}
