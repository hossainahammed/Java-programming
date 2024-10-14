
package week.pkg3;
import java.util.Scanner;

public class MathFunction_Ques_1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

    
        double absValue = Math.abs(number);
        System.out.println("Absolute value: " + absValue);


        double floorValue = Math.floor(number);
        System.out.println("Floor value: " + floorValue);

       
        double ceilValue = Math.ceil(number);
        System.out.println("Ceil value: " + ceilValue);

      
        long roundValue = Math.round(number);
        System.out.println("Round value: " + roundValue);

     
        double sqrtValue = Math.sqrt(number);
        System.out.println("Square root value: " + sqrtValue);
    }
    
}
