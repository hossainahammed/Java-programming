


import java.util.Scanner;
import java.util.Arrays;

public class Alphabetical {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left by nextInt()

        String[] strings = new String[numStrings];

        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i+1) + ": ");
            strings[i] = scanner.nextLine();
        }

        Arrays.sort(strings);

        System.out.println("Strings in alphabetical order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
    
    
    
}
