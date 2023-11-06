//java program to print the first non repeating character in a string
import java.util.*;
public class nonrepeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[256];
        String s=sc.nextLine();
        int k=0;
        char c ='a';
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
            //System.out.println(a[s.charAt(i)]);
        }
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)]==1){
                k=1;
                c=s.charAt(i);
                break;
            }
            else {
                continue;
            }
        }
        if(k==1)
            System.out.println(c);
        else
            System.out.println("all repeting");

    }
}
