import java.util.*;
public class even_odd {
    Node head=null;
    Node temp=null;
    Node oh=null;
    Node ot=null;
    Node eh=null;
    Node et=null;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    void even(int n){
        Node nn=new Node(n);
        if(eh==null){
            eh=nn;
            et=nn;
        }else{
            et.next=nn;
            et=nn;
        }
    }

    void odd(int n){
        Node mcu=new Node(n);
        if(oh==null){
            oh=mcu;
            ot=mcu;
        }else{
            ot.next=mcu;
            ot=mcu;
        }
    }

    void disp(){
        head=oh;
        temp=oh;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        head=eh;
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        even_odd obj=new even_odd();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n<0){
                break;
            }else {
                if (n % 2 == 0)
                    obj.even(n);
                else
                    obj.odd(n);
            }
        }
        obj.disp();
    }
}
