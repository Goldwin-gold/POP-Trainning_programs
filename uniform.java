import java.util.*;
class uniform
{
    public static void main(String args[])
    {
        //Try out your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        int b=0;
        int a[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if(i==j)
                    d=d+a[i][j];
                if(i+j==n-1)
                    b=b+a[i][j];
                else
                    continue;
            }
        }
        if(d!=b)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
