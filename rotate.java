public class rotate {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int l = a.length;
        int l1 = a[0].length;
        for(int i=0;i<(l);i++){
            for(int j=0;j<(l1);j++){
                System.out.print(a[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
