// java program to find whether the given two words is anagram or not
import java.util.*;
class Anagram
{
    static int calc(String x,String y,int z){
        int k=0;//System.out.println(z);
        for(int i=0;i<x.length();i++){
            for(int j=0;j<y.length();j++){
                if(x.charAt(i)==y.charAt(j))
                    k=k+1;
            }
        }
        if(k==z)
            return 1;
        else
            return 0;
    }

    public static void main(String args[])
    {
        //Try out your code here
        //System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int w;
        if(a.length()!=b.length())
            System.out.println("Not Anagram");
        else{
            w=calc(a,b,a.length());
            if(w==1)
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
    }
}
