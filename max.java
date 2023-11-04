import java.util.*;
public class max {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n=sc.nextInt();
            int a[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int b[][]=new int[n][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    b[j][i] = a[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(b[i][j]);
                }
                System.out.println();
            }
            int lol=0;
            for (int i = 0; i < n; i++) {
                lol=0;
                for (int j = 0; j < m; j++) {
                    if(b[i][j]>lol)
                        lol=b[i][j];
                }
                System.out.println(lol);
            }
        }
    }
