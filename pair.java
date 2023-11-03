import java.util.*;
public class pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int i=0,j=n-1;
        do{
            System.out.println(a[i]+"\t"+a[j]);
            i++;
            j--;
        }while(i<j);
        if(n%2!=0){
            System.out.println(a[i]+"\t"+"0");
        }
    }
}
