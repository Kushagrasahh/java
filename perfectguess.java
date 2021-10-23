import java.util.Scanner;
import java.util.Random;
public class perfectguess {
    public static void main(String args[]){
        Random rc =new Random();
        int a= rc.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int count =0; 
        while (true){
            System.out.println("Enter your number: ");
            int b = sc.nextInt();
           if(a>b){
            System.out.println("OOPS! Please enter a greater number ");
            count=count+1;
            
           }
           else if(a<b){
            System.out.println("OOPS! Please enter a smaller number");
            count= count+1;
            
           }
           else if(a==b){
            count=count+1;
            System.out.printf("Congrats! You find the number in %d countes",count);
            break;
        }  
          
        }
    }
}
