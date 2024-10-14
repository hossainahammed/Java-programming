
package Lab2;

import java.util.Scanner;
public class chekher {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch;
        
        
        ch=sc.next().charAt(0);
        
        if(ch>='0' && ch<='9')
            System.out.println(ch+"is a Digit");
        else if((ch>='a' &&ch<='z' )|| (ch>='A' && ch<='Z')){
            System.out.print(ch+" is an Alphabet:");
        
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U'){
                System.out.println("It is an Vowel");
            }else{
                System.out.println("It is a Consonent");
            }
        }else
            System.out.println(ch+" is a special Character");
        
    }
    
}
