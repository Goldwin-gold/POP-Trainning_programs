import java.util.*;
public class single {
    public static int sum(int x){
        int n=x;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s= sum(a);
        while(s>9) {
            s=sum(s);
            }
        System.out.println("sum="+s);
        }
    }

