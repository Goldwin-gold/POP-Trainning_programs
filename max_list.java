/* Find maximum element in linked list
Write a program to find the maximum number in a list.



Example:

Input:

1

7

2

5

-1

Output:

7


Case 1
Case 2
Input (stdin)
1
5
2
4
7
3
-1

Output (stdout)
7 */
import java.util.*;
class max_list
{
    Node head=null;
    Node temp=null;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    void ins(int n){
        Node nn=new Node(n);
        if(head==null){
            head=nn;
            temp=nn;
        }
        else{
            temp.next=nn;
            temp=nn;
        }
    }

    int disp(){
        Node t=head;
        Node travel=head;
        while(travel!=null){
            if(t.data<travel.data){
                t=travel;
            }
            travel=travel.next;
        }
        //System.out.println(t.data);
        return t.data;
    }
    public static void main(String args[])
    {
        //Try out your code here
        //System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        max_list obj=new max_list();
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n<0)
                break;
            else{
                obj.ins(n);
            }
        }
        System.out.println(obj.disp());
    }
}
