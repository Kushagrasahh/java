import java.util.Scanner;
public class r2{
    static int res(String s,int z){
        Scanner t =new Scanner(System.in);
        int sum11=0;
        while(true){
        System.out.printf("%s:%d ",s,z);
        System.out.println();
        System.out.println("Enter quantity: ");
        int p1 =t.nextInt();
        int p2 = z*p1;
        System.out.printf("Your current Sum for %s of quantity %d is %d  ",s,p1,p2);
        sum11+=p2;
        System.out.println();
        
        break;
    }
    return (sum11);
        
    }
    public static void main(String args[]){
        System.out.println("*****Welcome to RoofYard Cafe And Lounge*****");
        System.out.println();
        System.out.println("Please Select Your Order-->");
        System.out.println();
        System.out.println("PANEER->250   COFFE->100   SAMOSA->50  \nMANCHURIAN->400   CHOWMEIN->200  TEA->20\nFRIES->350   RICE->100   TAWAROTI->60");
        System.out.println();
        Scanner sc =new Scanner(System.in);
        int sum111=0;
        while(true){
            System.out.println();
            System.out.println("Please Enter 'PLACE' to order or 'OK' to exit: ");
            String r=sc.next();
            if(r.equals("OK")){
                break;
            }
            System.out.println();
            System.out.println("Enter your order: ");
            String o=sc.next();
            System.out.println("Enter correct Amount: ");
            int e=sc.nextInt();
            System.out.println();
             if(r.equals("PLACE")){
                int a = res(o, e);
                sum111=a+sum111;
                System.out.printf("Your Total Bill Is %d ",sum111);
                }
            }
           System.out.println("Thanks for Ordering The Food!!");
    System.out.println("TOTAL PAYOUT: "+sum111);
        }
    }
