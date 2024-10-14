
package Equal;
import java.util.Scanner;


public class Equal {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter string 2: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter string 3: ");
        String str3 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("String 1 is equal to String 2.");
        } else if (str1.equals(str3)) {
            System.out.println("String 1 is equal to String 3.");
        } else if (str2.equals(str3)) {
            System.out.println("String 2 is equal to String 3.");
        } else {
            System.out.println("No two strings are equal.");
        }
    }
    
}
