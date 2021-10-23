import java.util.Random;
import java.util.Scanner;
public class rpsgame {
    public static void main(String args[]){
         String compturn = "";
           Random rc = new Random();
          
             int a = rc.nextInt(2);
             if (a==0){
                    compturn ="rock";
             }
            else if(a==1){
                compturn = "paper";
            }
            else if(a==2){
                compturn = "scissors";
            }
            
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Your Choice: \nrock  paper scissors");
            String human = sc.next();

        if (compturn.equals("rock") && human.equals("scissors") ){
                System.out.println("CPU WON !! . Try Next Time");
                System.out.printf("computer choose %s and you choose %s",compturn,human);
            }
        else if(compturn.equals("rock") && human.equals("paper")){
                System.out.println("Congratulations you won!!");
                System.out.printf("computer choose %s and you choose %s",compturn,human);
            }
        else if(compturn.equals("rock") && human.equals("rock")){
                System.out.println("OOPS!! Thats a tie.");
                System.out.printf("computer choose %s and you also choose %s",compturn,human);
            }


        if (compturn.equals("paper") && human.equals("rock") ){
                System.out.println("CPU WON !! . Try Next Time");
                System.out.printf("computer choose %s and you choose %s",compturn,human);
                
            }
        else if(compturn.equals("paper") && human.equals("scissors")){
                System.out.println("Congratulations you won!!");
                System.out.printf("computer choose %s and you choose %s",compturn,human);
            }
        else if(compturn.equals("paper") && human.equals("paper")){
                System.out.println("OOPS!! Thats a tie.");
                System.out.printf("computer choose %s and you also choose %s",compturn,human);
            }


            
        if (compturn.equals("scissors") && human.equals("paper") ){
                System.out.println("CPU WON !! . Try Next Time");
                System.out.printf("computer choose %s and you choose %s",compturn,human);
                
            }
        else if(compturn.equals("scissors") && human.equals("rock")){
                System.out.println("Congratulations you won!!");
                System.out.printf("computer choose %s and you choose %s",compturn,human);
            }
        else if(compturn.equals("scissors") && human.equals("scissors")){
                System.out.println("OOPS!! Thats a tie.");
                System.out.printf("computer choose %s and you also choose %s",compturn,human);
            }
    }
}
