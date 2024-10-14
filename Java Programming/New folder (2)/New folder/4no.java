import java.util.Scanner;
public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rad, area;
        System.out.print("Enter radious: ");
        rad = input.nextDouble();
        area = 3.1416 * rad * rad;
        System.out.printf("%.2f", area);
    }
}