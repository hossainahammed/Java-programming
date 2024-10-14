
package Lab2;

import java.util.Scanner;

public class area {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double radius,area;
        radius=input.nextDouble();
        area=3.1416*radius*radius;
        
        System.out.println("Area of a circle="+area);
    }   
}
