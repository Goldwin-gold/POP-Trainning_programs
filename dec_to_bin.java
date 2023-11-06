// java program to convert decimal to binary
import java.util.*;
class Main
{
    int dec(int n){
        if(n==0)
            return 0;
        else
            return n%2+10*dec(n/2);
    }
    public static void main(String args[])
    {
        //Try out your code here
        // System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        Main obj=new Main();
        int a=sc.nextInt();
        System.out.println(obj.dec(a));
    }
}