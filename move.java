import java.util.*;
public class move {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int b=0;
            int a=0;
            int num=sc.nextInt();
            while(num>0){
                int d=num%10;

                if(d==0)
                    a++;
                else
                    b++;
                num=num/10;
            }
            for(int i=0;i<b;i++)
                System.out.print("1");
            for(int i=0;i<a;i++)
                System.out.print("0");
            n--;
            System.out.println();
        }
    }
}
