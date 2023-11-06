//java program to check palindrome word or not
import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        //Try out your code here
        //System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        int i=0;
        int j=s.length()-1;
        int k=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("Not a Palindrome");
                break;
            }
            else{
                i++;
                j--;
            }
        }
        if(i==j)
            System.out.println("Palindrome");
    }}
