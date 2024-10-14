
package Lab2;

import java.util.Scanner;

public class information {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
                
        
        String name=input.nextLine();
        System.out.println("My name is "+name);
        
        int age=input.nextInt();
        System.out.println("I am "+age+"Years old");
        
        input.nextLine();
        
        String id=input.nextLine();
        System.out.println("my id is:"+id);
        
        float cgpa=input.nextFloat();
        System.out.println("My CGPA="+cgpa);
        
        input.nextLine();
        
        String department=input.nextLine();
        System.out.println("My department is:"+department);
        
        String section=input.nextLine();
        System.out.println("My Section is:"+section);
    }    
}
