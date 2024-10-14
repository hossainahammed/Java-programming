
package week.pkg3;
import java.util.Scanner;


public class SmallAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students' CGPA you want to insert? ");
        int n = input.nextInt();
        double[] cgpaArray = new double[n];
        System.out.print("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            cgpaArray[i] = input.nextDouble();
        }
        double smallestCGPA = cgpaArray[0];
        double largestCGPA = cgpaArray[0];
        for (int i = 1; i < n; i++) {
            if (cgpaArray[i] < smallestCGPA) {
                smallestCGPA = cgpaArray[i];
            }
            if (cgpaArray[i] > largestCGPA) {
                largestCGPA = cgpaArray[i];
            }
        }
        System.out.println("Smallest CGPA: " + smallestCGPA);
        System.out.println("Largest CGPA: " + largestCGPA);
    }
    
    
}
