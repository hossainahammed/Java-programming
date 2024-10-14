
package javaapplication9;


public class maximumElement {
    
     public static int maxValue(int[] arr) {
        

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
     
     public static void main(String[] args) {
        int[] arr = {5, 10, 2, 8, 3};
int max = maximumElement.maxValue(arr);
System.out.println("The maximum value in the array is " + max);
    }
    
}
