import java.util.Scanner;
public class SortArray {
    public static void main(String arge[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int x=n+m;
        int a[]=new int [n];
        int b[]=new int[m];
        int c[]=new int [x];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            c[i]=a[i];
        }
        for(int i=0;i<m;i++){
            c[n+i]=b[i];
        }
        for(int i=0;i<x;i++){
           System.out.println(c[i]);
        }
        float median;
        if (x % 2 == 0) {

            median = (c[(x / 2) - 1] + c[x / 2]) / 2.0f;
        } else {

            median = c[x / 2];
        }
        System.out.println("Median is: " + median);



    }
}
