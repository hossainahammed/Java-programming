
package array;
import java.util.Scanner;
import java.util.Arrays;
public class Array {

    public static void main(String[] args) {
       System.out.println("Enter the size of the array");
       Scanner input= new Scanner(System.in);
       int size =input.nextInt();
       int[]arr = new int[size];
       System.out.println("Enter " + size + " array elements:");
       for(int i=0;i<size;i++)
       {
           arr[i] = input.nextInt();

    }
      
      
   for(int i = 0; i<1; i++)
      {
          Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
         
          
        	
      
    }     
 
}
}