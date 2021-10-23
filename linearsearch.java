import java.util.Scanner;
public class linearsearch{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to search: ");
        int number = sc.nextInt();
        boolean isin = false;
        int [] arr;
        arr=new int[5];
        arr[0]=23;
        arr[1]=34;
        arr[2]=67;
        arr[3]=89;
        arr[4]=98;
        int i=0;
        int value=0;
        for( i=0;i<arr.length;i++){
            if(number==arr[i]){
               isin = true;
               value+=i;
               break;
            }
        }
        if(isin){
            System.out.println("The particular value is you are trying to search is in the array at position: "+value);
        }
        
            
        else{
            System.out.println("The value you are trying to find is not in the array");
        }
       

        
        
    }
}