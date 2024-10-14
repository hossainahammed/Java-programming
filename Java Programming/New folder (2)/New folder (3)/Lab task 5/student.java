import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cgpa;
    
    public void insertRecord(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    
    public void displayRecord() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student student1 = new Student();
        System.out.print("Enter name of student 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter ID of student 1: ");
        int id1 = sc.nextInt();
        System.out.print("Enter CGPA of student 1: ");
        double cgpa1 = sc.nextDouble();
        student1.insertRecord(name1, id1, cgpa1);
        
        Student student2 = new Student();
        sc.nextLine(); 
        System.out.print("Enter name of student 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter ID of student 2: ");
        int id2 = sc.nextInt();
        System.out.print("Enter CGPA of student 2: ");
        double cgpa2 = sc.nextDouble();
        student2.insertRecord(name2, id2, cgpa2);
        
        System.out.println("Student 1:");
        student1.displayRecord();
        
        System.out.println("Student 2:");
        student2.displayRecord();
        
        sc.close();
    }
}
