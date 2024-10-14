
package Lab2;
import java.util.Scanner;
public class multiplication_table {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a number:");
            int a=sc.nextInt();
            
            for (int i = 8; i <=a; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i+"x"+j+"="+i*j);
                    
                }
                System.out.println("\n");
            
        }
    }
    
}
