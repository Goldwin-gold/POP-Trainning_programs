import java.util.*;
public class zig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if(i==0||i==n-1||i+j==n-1)
                    System.out.println(a[i][j]);
            }
        }
    }
}
