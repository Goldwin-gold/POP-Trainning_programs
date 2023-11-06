//to check a number whether prime or not using recursion
import java.util.*;
class prime2
{
    int prime(int n, int i){
        if(i==1)
            return 1;
        else if(n%i==0)
            return 0;
        else
            return prime(n,i-1);
    }
    public static void main(String args[])
    {
        //Try out your code here
        //System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        prime2 obj=new prime2();
        int c=obj.prime(a,a/2);
        if(c==1)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
