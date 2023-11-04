import java.util.*;
public class sumOdd {
    int sum(int a[],int i,int n){
        if(i==n){
            return 0;
        }
        else{
            if(a[i]%2!=0)
                return a[i]+sum(a,i+1,n);
            else
                return sum(a,i+1,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sumOdd obj=new sumOdd();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        System.out.println(obj.sum(a,i,n));
    }
}
