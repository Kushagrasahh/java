public class ll {
    //Method for linear search
    static int linearsearch(int arr[],int k ){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k)
                return i;
            
        }
        return -1;
    }
    //method for removing an character at particular index
    static String remove(String s,int k){
        if(k>s.length()){
            return "-1";
        }
        else{
        s=s.substring(0,k)+s.substring(k+1);
        
        return s;
        }
    }

    public static void main(String args[]){
        // Linear search logic
         int array[]={3,5,43,4,65,6,67,90,775,334,22};
         int x=775;
         int result= linearsearch(array, x);
         if(result==-1){
             System.out.println("The value is not present in the array");
         }
         else{
             System.out.println("The value is present in the array at position "+ result);
         }


         //Removing character logic
         String p ="PYTHON";
         int y =2;
         String res = remove(p, y);
         System.out.println(res);
    }
    
}
