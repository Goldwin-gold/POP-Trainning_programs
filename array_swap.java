import java.util.*;
public class array_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int i=0;
        int j=n-1;
        while(i<j){
            while(a[i]%2==0){
                i++;
            }
            while(a[j]%2!=0){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.println(a[k]);
        }
    }
}

