public class factorial {
    public int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        factorial obj=new factorial();
        System.out.println(obj.fact(5));
    }
}
