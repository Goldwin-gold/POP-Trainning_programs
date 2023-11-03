import java.util.*;
public class bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum=0,bus=1; int b = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (sum+a[i]>b){
                bus++;
                sum=a[i];
            }else{
                sum=sum+a[i];
            }
        }

        System.out.println(bus);
    }
}
