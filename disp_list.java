/* Insert an element in linked list
Write a program to insert an element at the end of the linked list. Get the values continuously from the user until the user enters a negative value.



Format:

Input:

The input should be numbers (until user enters a negative value).

Output:

The output should be the list elements in separate lines.



Example:

Input:

1

2

3

4

-1

Output:

1

2

3

4


Case 1
Case 2
Case 3
Input (stdin)
1
2
3
4
-1

Output (stdout)
1
2
3
4 */
import java.util.*;
class disp_list
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
        disp_list obj=new disp_list();
        while(true){
            int n=sc.nextInt();
            if(n==-1){
                break;
            }else{
                obj.ins(n);
            }
        }
        obj.disp();
    }
}