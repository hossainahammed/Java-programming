
package javaapplication9;

public class maximum {
    
    public static int maxValue(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String[] args) {
       int max= maximum.maxValue(10, 20);
        System.out.println("Maximum "+max);
    }
    
}
