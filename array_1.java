import java.util.*;
public class array_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=0,even=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0)
                even=even+a[i];
            else
                odd=odd+a[i];
        }
        System.out.println("odd="+odd);
        System.out.println("even="+even);
    }
}
