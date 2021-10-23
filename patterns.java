public class patterns {
     public static void main(String args[]) {
     //Solid Rectangle Pattern
     System.out.println("Solid Rectangle");
     int n=5;
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             System.out.print("*");
         }
         System.out.println();
     }
       //hollow rectangle pattern
       System.out.println("Hollow Rectangle");
       int m=5;
       for (int i=1;i<=m;i++){
           for(int j=1;j<=m;j++){
               if(i==1 || j==1 || i==m || j==m){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
       //left pyramid pttern
       System.out.println("Left pyramid Pattern");
       int n1=5;
       for(int i=1;i<=n1;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
        }
        //inverted left pyramid
        int m1=5;
        System.out.println("Inverted Left Pyramid");
        for(int i=0;i<m1;i++){
            for(int j=0;j<m1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //rotated pyramid pattern
        int k=5;
        System.out.println("Rotated Pyramid Pattern");
        for(int i=0;i<k;i++){
            for(int j=0;j<k-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //numeric number pattern
        int k1=5;
        System.out.println("Numeric Number Pattern");
        for(int i=1;i<=k1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //inverted number pattern
        int k2=5;
        System.out.println("Inverted Number Pattern");
        for(int i=0;i<k2;i++){
            for(int j=1;j<=k2-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //floyd warshell triangle
        int v=5;
        int number=1;
        System.out.println("Floyd Warshell Triangle");
        for(int i=1;i<=v;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        //binary pattern
        int v1=5;
        System.out.println("Binary Pattern");
        for(int i=1;i<=v1;i++){
            for(int j=1;j<=i;j++){
               int sum=(i+j);
               if(sum%2==0){
                   System.out.print("1 ");
               }else{
                   System.out.print("0 ");
               }
            }
            System.out.println();
        }
     }
}
