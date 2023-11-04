import com.sun.tools.javac.Main;

import java.util.*;
class power
{
    int pow(int b,int p){
        if(p==0)
            return 1;
        else
            return b*pow(b,p-1);
    }
    public static void main(String args[])
    {
        //Try out your code here
        //System.out.println("Hello World!");
        power obj=new power();
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int p=sc.nextInt();
        System.out.println("The value of "+b+" power "+p+" is "+obj.pow(b,p));
    }
}
