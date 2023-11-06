// number of digits using recursion
import java.util.*;
class no_of_digits
{
    int count(int a){
        if(a<=9)
            return 1;
        else
            return 1+count(a/10);
    }

    public static void main(String args[])
    {
        //Try out your code here
        //System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        no_of_digits obj=new no_of_digits();
        int a=sc.nextInt();
        System.out.println("The number of digits in "+a+" is "+obj.count(a));
    }
}
