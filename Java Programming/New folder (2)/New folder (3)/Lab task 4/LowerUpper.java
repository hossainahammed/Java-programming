import java.util.Scanner;
public class LowerUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String str1 = scanner.nextLine();

       
        String str2 = scanner.nextLine();

        String str1Lower = str1.toLowerCase();
        String str2Lower = str2.toLowerCase();

        String str1Upper = str1.toUpperCase();
        String str2Upper = str2.toUpperCase();

        System.out.println("Lower case:");
        System.out.println(str1Lower);
        System.out.println(str2Lower);

        System.out.println("Upper case:");
        System.out.println(str1Upper);
        System.out.println(str2Upper);
    }
    
    
}
