import java.util.Scanner;

import java.util.Scanner;
public class percentage {
    // This Program Takes marks of five students and prints percentage
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter subject1 marks: ");
        float sub1=sc.nextFloat();
        System.out.println("enter subject2 marks: ");
        float sub2=sc.nextFloat();
        System.out.println("enter subject3 marks: ");
        float sub3=sc.nextFloat();
        System.out.println("enter subject4 marks: ");
        float sub4=sc.nextFloat();
        System.out.println("enter subject5 marks: ");
        float sub5=sc.nextFloat();

        float percentage= ((sub1+sub2+sub3+sub4+sub5)/500)*100;
        System.out.println("the percentage of student is :");
        System.out.println(percentage);

   

        
    }
    
}
