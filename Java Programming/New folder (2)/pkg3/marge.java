
package week.pkg3;

import java.util.*;
public class marge {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter the number of elements in the first array: ");
        n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of elements in the second array: ");
        n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] mergedArray = new int[n1 + n2];
        int k = 0;
        for (int i = 0; i < n1; i++) {
            mergedArray[k++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArray[k++] = arr2[i];
        }
        System.out.print("Merged array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();
    }
    
}
