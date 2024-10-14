
package javaapplication9;


public class Circle {
    public double radius(double r){
        return 3.1416*r*r;
    }
    public static void main(String[] args) {
        Circle area= new Circle();
        
        double CircleArea= area.radius(5);
        System.out.println("The radius is "+CircleArea);
    }
    
}
