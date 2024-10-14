
package week.pkg3;

import java.util.Scanner;
public class Search {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers you want to insert? ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Total cases = ");
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
           
            int x = scanner.nextInt();

            int index = linearSearch(arr, x);

            if (index == -1) {
                System.out.println(x + " not found in the array");
            } else {
                System.out.println(x + " found at index " + index);
            }
        }
    }

    
    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }
    
}
