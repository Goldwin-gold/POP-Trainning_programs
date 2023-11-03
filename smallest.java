import java.util.*;
public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b[]=new int[n];
        int k=0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]>=0){
                b[k]=a[i];
                k++;
            }
        }
        int x=b[0];
        for(int i=0;i<n;i++){
            if(b[i]==x){
                x++;
            }else {
                System.out.println(x);
                break;
            }
        }
    }
}
