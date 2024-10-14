
package Lab2;

import java.util.Scanner;
public class four_integer {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a,b,c,d,A,B,C,D;
        A=input.nextInt();
        B=input.nextInt();
        C=input.nextInt();
        D=input.nextInt();
        
        a=(A*B-C*D);
        b=(2*A-B+3*D);
        c=(A*A+B*B-C*C+D*D);
        d=(A*A*A)+B-(C*C);
        
        System.out.println("Solution of Equation-1="+a);
        System.out.println("Solution of Equation-2="+b);
        System.out.println("Solution of Equation-3="+c);
        System.out.println("Solution of Equation-3="+d);
        
    }
}
