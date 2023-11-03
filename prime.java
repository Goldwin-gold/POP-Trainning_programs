public class prime {
    public int check(int x){
        int c=0;
        for(int i=1;i<=x/2;i++){
            if(x%i==0)
                c=c+1;
        }
        return c;
    }

    public static void main(String[] args) {
        prime obj=new prime();
        for(int i=2;i<=11;i++){
            int x= obj.check(i);
            if(x==1)
                System.out.println(i);
        }
    }
}
