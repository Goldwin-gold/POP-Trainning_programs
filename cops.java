import java.util.*;
public class cops {
    public int sum(int x){
        int n=x;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }
    public  static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        cops obj=new cops();
        int s= obj.sum(a);
        while(s>9) {
            s= obj.sum(s);
        }
        System.out.println("sum="+s);
    }
}
