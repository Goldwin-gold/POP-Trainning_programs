/* Delete an element in linked list
Write a program to delete an element at the beginning of the linked list. Get the values continuously from the user until the user enters a negative value.



Format:

Input:

The input should be numbers (until user enters a negative value).

Output:

The output should be the list of numbers in separate lines.



Example:

Input:

1

2

3

4

-1

Output:

2

3

4


Case 1
Case 2
Case 3
Input (stdin)
10
20
30
40
50
60
-1

Output (stdout)
20
30
40
50
60 */
import java.util.*;
class del_beg
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
        }else{
            temp.next=nn;
            temp=nn;
        }
    }
    void del(){
        head=head.next;
    }

    void disp(){
        Node t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }

    public static void main(String args[])
    {
        //Try out your code here
        //System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        del_beg obj=new del_beg();
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n<0){
                break;
            }else{
                obj.ins(n);
            }
        }
        obj.del();
        obj.disp();
    }
}
