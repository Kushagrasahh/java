import java.util.Scanner;
class printingmethods {
    public static void main(String args[]){
        int a=5;
        float b=4.556f;
        String s="google";
        System.out.printf("The Value Of a is  %d and b is %f and s is %s ",a,b,s);
        System.out.println();
        /*
        int=%d
        float=%f
        character=%c
        string=%s
        */
        System.out.format("The Value Of a is  %d and b is %.2f and s is %s ",a,b,s);
        System.out.println();
        // next and nextline are different in java while using strings
        Scanner sc = new Scanner(System.in);
        String a1 =sc.nextLine();
        String a2 =sc.next();
        System.out.println(a1);
        System.out.println(a2);


    }


    
}
