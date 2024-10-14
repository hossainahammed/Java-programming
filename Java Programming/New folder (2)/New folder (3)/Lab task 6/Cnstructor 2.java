public class Student {
    private String name;
    private int id;
    private double cgpa;

    public Student() {
        this.name = "Anas";
        this.id = 4789;
        this.cgpa = 4.0;
    }

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }

    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student("Hossain", 4694, 4.00);
        students[3] = new Student("Niaz", 67890, 3.5);

        System.out.println("List of all students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i+1) + ":");
            students[i].display();
        }
    }
}
