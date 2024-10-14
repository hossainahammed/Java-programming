
package week.pkg04;
import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cgpa;
    
    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa: = cgpa;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create first student object and take input for its variables
        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Id: ");
        int id1 = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left by nextInt()
        System.out.print("Cgpa: ");
        String cgpa1 = scanner.nextLine();
        
        Student student1 = new Student(name1, id1, cgpa1);
        
        // Create second student object and take input for its variables
        System.out.println("Enter details for Student 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Id: ");
        int id2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Cgpa: ");
        String cgpa2 = scanner.nextLine();
        
        Student student2 = new Student(name2, id2, cgpa2);
        
        
        System.out.println("Details of Student 1:");
        student1.display();
        
        System.out.println("\nDetails of Student 2:");
        student2.display();
    }
}

