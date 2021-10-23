public class selectionsort {
    static void arr(int [] k){
          int n=k.length;
          for (int i=0;i<n-1;i++){
              int pos=i;
              for(int j=i+1;j<n;j++){
                  if (k[j]<k[pos]){
                      pos=j;
                  }  
              }
              int temp =k[i];
              k[i]=k[pos];
              k[pos]=temp;
          }

        }
          

    
    public static void main(String args[]){
        int[] k={23,45,67,43,22,1};
        System.out.println("Array before sorting");
        for(int i=0;i<k.length;i++){

            System.out.print(k[i]+" " );
        }
        arr(k);
        System.out.println();
        System.out.println("Array after sorting");
        for(int i=0;i<k.length;i++){

            System.out.print(k[i]+" " );
        } 
    }
}
