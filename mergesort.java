public class mergesort {
    static void mergesortt(int [] arr,int left,int right){
        if (left<right){
            int mid=((left+right)/2);
            mergesortt( arr,left,mid);
            mergesortt(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    static void merge(int[] arr,int left,int mid,int right){
     int i=left;
     int j=mid+1;
     int k=left;
     int b []   = new int [arr.length];
     while (i<=mid && j<=right){
         if(arr[i]<arr[j]){
             b[k]=arr[i];
             i++;
             k++;
         }
         else{
             b[k]=arr[j];
             j++;
             k++;
         }

     }
     while (i<=mid){
         b[k]=arr[i];
         i++;
         k++;

     }
     while (j<=right){
        b[k]=arr[j];
        j++;
        k++;
        
    }
    for(int v=left;v<(right+1);v++){
           arr[v]=b[v];

    }





    }
    
    public static void main(String args[]){
        
        int [] o={2,45,32,22,11,7,5,9,1};
        System.out.println("Array before sort :");
        for (int i=0;i<o.length;i++){
            System.out.print(o[i]+" " );
        }
        mergesortt(o, 0, (o.length-1));
        System.out.println();
        System.out.println("Array after sort :");
        for (int i=0;i<o.length;i++){
            System.out.print(o[i]+" " );
        }

    }
}
