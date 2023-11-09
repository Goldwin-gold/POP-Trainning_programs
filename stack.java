import java.util.*;
public class stack {

    node head=null;
    node tail=null;

    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }

    void push(int n){
        node nn=new node(n);
        if(head==null){
            head=nn;
            tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
    }

    void pop(){
        node temp=head;
        if(head==null)
            System.out.println("-1");
        if(head.next==null){
            int data= head.data;
            head=null;
            tail=null;
            System.out.println(data);
        }else {
            while(temp.next.next!=null){
                temp=temp.next;
            }
            int data= temp.next.data;
            tail=temp;
            tail.next=null;
            System.out.println(data);

        }
    }

    void size(){
        int s=0;
        node t=head;
        while(t!=null){
            s=s+1;
            t=t.next;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack obj=new stack();
        int n=sc.nextInt();
        while(sc.hasNext()){
            String s=sc.nextLine();
            if(s.equals("push")){
                int ele=sc.nextInt();
                obj.push(ele);
            }
            else if(s.equals("pop")){
                obj.pop();
            } else if(s.equals("e")){
                break;
            }else if(s.equals("size")){
                obj.size();
            }
        }
    }
}
