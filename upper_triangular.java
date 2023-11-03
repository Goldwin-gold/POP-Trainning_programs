import java.util.*;
public class upper_triangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int k=0;
        for(int i=1;i<n;i++) {
            for (int j = 0; j < i; j++) {
                if(a[i][j]!=0){
                    k=1;
                    break;
                }
            }
        }
        if(k==1)
            System.out.println("not a upper triangular matrix");
        else
            System.out.println("upper triangular matrix");
    }
}
