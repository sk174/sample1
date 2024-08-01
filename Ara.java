import java.util.Scanner;

public class Ara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = n + m;
        int a[] = new int[n];
        int b[] = new int[m];
        int c[] = new int[x];

        // Read elements into array a
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Read elements into array b
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        // Copy elements from array a to array c
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }

        // Copy elements from array b to array c
        for (int i = 0; i < m; i++) {
            c[n + i] = b[i];
        }

        // Print elements of array c
        for (int i = 0; i < x; i++) {
            System.out.println(c[i]);
        }

        sc.close();
    }
}
