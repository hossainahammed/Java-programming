
package week.pkg3;

import java.util.Random;

public class MathFunction_Ques_3 {
     public static void main(String[] args) {
        Random rand = new Random();
        int min = 0;
        int max = 200;
        int n = 5;
        System.out.print("Random Numbers: ");
        for (int i = 0; i < n; i++) {
            int randNum = rand.nextInt((max - min) + 1) + min;
            System.out.print(randNum + " ");
        }
    }
    
}
