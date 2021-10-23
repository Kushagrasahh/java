import java.util.Scanner;
public class restraunt {
    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("*****Welcome to RoofYard Cafe And Lounge*****");
        System.out.println();
        System.out.println("Please Select Your Order-->");
        System.out.println();
        System.out.println("PANEER->250   COFFE->100   SAMOSA->50  \nMANCHURIAN->400   CHOWMEIN->200  TEA->20\nFRIES->350   RICE->100   TAWAROTI->60");
        System.out.println();
        int sum1=0;
        while(true){
        System.out.println();    
        System.out.println("Enter your order: ");
        String s =sc.next();
        if (s.equals("PANEER")){
            System.out.println("Price:250");
            System.out.println("Enter quantity:");
            int a=sc.nextInt();
            sum1+=(250*a);
            int a1=(250*a);
            System.out.printf("Your current Sum for Paneer of quantity %d is %d  ",a,a1);
            System.out.println();
            System.out.printf("Your current Sum is %d",sum1);
        
        }
        else if (s.equals("COFFE")){
            System.out.println("Price:100");
            System.out.println("Enter quantity:");
            int b=sc.nextInt();
            sum1+=(100*b);
            int b1=(100*b);
            System.out.printf("Your current Sum for Coffe of quantity %d is %d  ",b,b1);
            System.out.println();
            System.out.printf("Your current Sum is %d  ",sum1);
        
        }
        else if (s.equals("SAMOSA")){
            System.out.println("Price:50");
            System.out.println("Enter quantity:");
            int c=sc.nextInt();
            sum1+=(50*c);
            int c1=(50*c);
            System.out.printf("Your current Sum for Samosa of quantity %d is %d  ",c,c1);
            System.out.println();
            System.out.printf("Your current Sum is %d ",sum1);
        
        }
        else if (s.equals("MANCHURIAN")){
            System.out.println("Price:400");
            System.out.println("Enter quantity:");
            int d=sc.nextInt();
            sum1+=(400*d);
            int d1=(400*d);
            System.out.printf("Your current Sum for Manchurian of quantity %d is %d  ",d,d1);
            System.out.println();
            System.out.printf("Your current Sum is %d",sum1);
        
        }
        else if (s.equals("CHOWMEIN")){
            System.out.println("Price:200");
            System.out.println("Enter quantity:");
            int e=sc.nextInt();
            sum1+=(200*e);
            int e1=(200*e);
            System.out.printf("Your current Sum for Chowmein of quantity %d is %d  ",e,e1);
            System.out.println();
            System.out.printf("Your current Sum is %d ",sum1);
        
        }
        else if (s.equals("TEA")){
            System.out.println("Price:20");
            System.out.println("Enter quantity:");
            int f=sc.nextInt();
            sum1+=(20*f);
            int f1=(20*f);
            System.out.printf("Your current Sum for Tea of quantity %d is %d  ",f,f1);
            System.out.println();
            System.out.printf("Your current Sum is %d ",sum1 );
        
        }
        else if (s.equals("FRIES")){
            System.out.println("Price:350");
            System.out.println("Enter quantity:");
            int g=sc.nextInt();
            sum1+=(350*g);
            int g1=(350*g);
            System.out.printf("Your current Sum for Fries of quantity %d is %d  ",g,g1);
            System.out.println();
            System.out.printf("Your current Sum is %d ",sum1);
        
        }
        else if (s.equals("RICE")){
            System.out.println("Price:100");
            System.out.println("Enter quantity:");
            int h=sc.nextInt();
            sum1+=(100*h);
            int h1=100*h;
            System.out.printf("Your current Sum for Rice of quantity %d is %d  ",h,h1);
            System.out.println();
            System.out.printf("Your current Sum is %d ",sum1);
        
        }
        else if (s.equals("TAWAROTI")){
            System.out.println("Price:60");
            System.out.println("Enter quantity:");
            int k=sc.nextInt();
            sum1+=(60*k);
            int k1=60*k;
            System.out.printf("Your current Sum for Tawaroti of quantity %d is %d  ",k,k1);
            System.out.println();
            System.out.printf("Your current Sum is %d ",sum1);
        
        }
        else if(s.equals("OK")){
            break;
        }
      }
        System.out.println("Thanks for Ordering The Food!!");
        System.out.printf("Your Total Bill Is %d ",sum1);
        }
    }
