import java.util.*;
public class Leet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        one(5);
        System.out.println("Enter the length of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        int i;

        for(i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        for( i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--){
            int x=a[i];
            int y=b[i];
            int z=x+y;
           c[i]=z;

        }

        for(i=0;i<n;i++){
            System.out.print(c[i]+" ");
        }


//        for(int i=0;i<n;i++){
//            System.out.println(a[i]);
//        }
//        for(int i=0;i<n;i++){
//            System.out.println(b[i]);
//        }
    }
}
