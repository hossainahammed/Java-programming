
package Lab2;

import java.util.Scanner;
public class Loop3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int count=0;
        
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                count++;
                break;
            }
            
        }if(count==0)
            System.out.println(num+" is a prime number");
        else
            System.out.println(num+" is not prime number");
    }
    
}
