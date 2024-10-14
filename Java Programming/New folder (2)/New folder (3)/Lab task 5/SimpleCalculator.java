
package javaapplication9;


public class SimpleCalculator {
    
     public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a,double b){
        
        return a/b;
    }
    
    
    public static void main(String[] args) {
        
        SimpleCalculator calc= new SimpleCalculator();
        
        double sum = calc.add(10, 20);
        System.out.println("Sum is "+sum);
        
        double sub = calc.subtract(20, 10);
        System.out.println("Sub is "+sub);
        
        double multi = calc.multiply(10, 20);
        System.out.println("Multi is "+multi);
        
        double divide = calc.divide(200, 20);
        System.out.println("Divide is "+divide);
    }
    
    
    
}
