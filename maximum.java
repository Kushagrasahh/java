public class maximum {
    public static void main(String args[]){
        int [] arr={2,3,4,6,5,7};
        /*long var=0;
        for(int i=0; i<arr.length;i++){
            if(var<arr[i]){
                var=arr[i];

            }
        }
        System.out.println("The maximum value in the given array is "+var);*/
        //reverse array
        /*for(int i=arr.length-1;i>0;i--){
            System.out.print(arr[i]);
            System.out.print(" ");*/
            // to check sorted array
            boolean ak =false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                   ak=true;
                }
                else{
                    ak=false;
                    break;
                }
            }
            if(ak){
                System.out.println("yes sorted!");
            }
            else{
                System.out.print("not sorted!");
            }
        }
    }



