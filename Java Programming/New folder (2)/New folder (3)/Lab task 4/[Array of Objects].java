import java.util.Scanner;

public class Mobile {
    private String brand;
    private String model;
    private double price;
    private int code;
    public Mobile(String brand, String model, double price,int code) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.code = code;
    }
    
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("code: " + code);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of mobiles to create: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        Mobile[] mobiles = new Mobile[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Mobile " + (i+1) + ":");
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Code: ");
            int code = scanner.nextInt();
            System.out.print("Price: $");
            double price = scanner.nextDouble();
            scanner.nextLine(); 
            
            mobiles[i] = new Mobile(brand, model, price,code);
        }
        
        System.out.println("\nDetails of all mobiles:");
        for (int i = 0; i < n; i++) {
            System.out.println("Mobile " + (i+1) + ":");
            mobiles[i].display();
            System.out.println(); 
        }
    }
}