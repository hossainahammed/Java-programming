
package Lab2;

import java.util.Scanner;
public class grading_system {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        
        if(mark>=80)
            System.out.println("A+");
        else if(mark>=75)
            System.out.println("A");
        else if(mark>=70)
            System.out.println("A-");
        else if(mark>=65)
            System.out.println("B+");
        else if(mark>=60)
            System.out.println("B");
        else if(mark>=55)
            System.out.println("B-");
        else if(mark>=50)
            System.out.println("C+");
        else if(mark>=45)
            System.out.println("C");
        else if(mark>=40)
            System.out.println("D");
        else
            System.out.println("F");
        
    }
    
}
