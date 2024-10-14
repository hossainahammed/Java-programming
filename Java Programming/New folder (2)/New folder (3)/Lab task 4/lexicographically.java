
package week.pkg04;
import java.util.Scanner;


public class lexicographically {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter string 2: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter string 3: ");
        String str3 = scanner.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        if (len1 > len2 && len1 > len3) {
            System.out.println("String 1 is greatest.");
        } else if (len2 > len1 && len2 > len3) {
            System.out.println("String 2 is greatest.");
        } else if (len3 > len1 && len3 > len2) {
            System.out.println("String 3 is greatest.");
        } else {
            System.out.println("All three strings have the same length.");
        }
    }

    
    
}
