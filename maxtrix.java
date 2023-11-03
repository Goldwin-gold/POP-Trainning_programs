public class maxtrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int l= a.length;
        int l1=a[0].length;
        //System.out.println(l*l1);
        int k=1;
        int low=0;
        int high=(l*l1)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int mid_row=mid/l1;
            int mid_col=mid%l1;
            if(a[mid_row][mid_col]==k) {
                System.out.println("found");
                break;
            }
            else if (a[mid_row][mid_col]<k)
                low=mid+1;
            else
                high=mid-1;
        }
    }
}
