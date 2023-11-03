public class pattern_2 {
    public static void main(String[] args) {
        int k=1,n=4,y=n*n+1;
        for(int i=n;i>=1;i--){
            for(int j=0;j<n-i;j++){
                System.out.print("--");
            }
            for(int z=1;z<=i;z++) {
                System.out.print(k + "*");
                k++;
            }
            for(int x=0;x<i-1;x++){
                System.out.print(y+"*");
                y++;
            }
            System.out.print(y);
            y=y-2*(i-1);
            System.out.println();
        }
    }
}
