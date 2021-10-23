public class insertionSort {
    static void arr(int [] k){
        
        int n=k.length;
          for (int i=1;i<n;i++){
              int temp=k[i];
              int pos=i;
              while (pos>0 && k[pos-1]>temp){
                  k[pos]=k[pos-1];
                  pos-=1;
              }
              k[pos]=temp;
            }
        
    }


    public static void main(String args[]) {
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
