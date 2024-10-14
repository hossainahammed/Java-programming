
package Lab2;


public class Maximum_value {
    public static void main(String[]args){
        int A,B,C;
        A=10;
        B=5;
        C=50;
        
        if(A>B && A>C)
            System.out.println("Maximum value= "+A);
        else if(B>A && B>C)
            System.out.println("Maximum value= "+B);
        else
            System.out.println("Maximum value= "+C);
    }
    
}
