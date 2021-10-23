import java.util.Scanner;
public class ques {
    public static void main(String args[]){
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks For First Subject");
        float sub1 = sc.nextFloat();
        System.out.println("Enter Marks For Second Subject");
        float sub2 = sc.nextFloat();
        System.out.println("Enter Marks For Third Subject");
        float sub3 = sc .nextFloat();
        float percentage = ((sub1+sub2+sub3)/300)*100;
        System.out.println(percentage);
        ;

        if (percentage>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("Congrats you have cleared in all subjects");

             
        }
        else{
            System.out.println("oops! you have failed ");
        }
*/
      // ques 2
      /*
      Scanner sc = new Scanner(System.in);
      System.out.println("enter day");
      int day=sc.nextInt();
      switch(day){
        case 1 -> System.out.println("monday");
        case 2 -> System.out.println("tuesday");
        case 3 -> System.out.println("wednesday");
        case 4 -> System.out.println("thrusday");
        case 5 -> System.out.println("friday");
        case 6 -> System.out.println("saturday");
        case 7 -> System.out.println("sunday");
      }
      */
      //ques 3
// wrong output
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter Year: ");
      int year = sc.nextInt();
      if (year%4==0){
          if(year%100==0){
              if(year%400==0)
                System.out.println("leapyear"); 
              
              else
                System.out.println("not leap year");
              
          }
          System.out.println("leap year");

      }
      System.out.println("not leap year");
    }
    
}
