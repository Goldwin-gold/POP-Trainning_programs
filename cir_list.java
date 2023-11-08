/* Insertion using Circular Linked List
Write a program to create a Circular Linked List. Which can store and display N number of data using dynamic memory allocation.

Hint: 1 indicates the Insertion of data and 0 indicates to display the inserted data.



Example:

Input:

10

1

20

1

30

0

Output:

10 20 30


Case 1
Case 2
Input (stdin)
10
1
20
1
30
0

Output (stdout)
10 20 30 */

import java.util.*;
class cir_list
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
            //temp.next=head;
        }else{
            temp.next=nn;
            temp=nn;
            temp.next=head;
        }
    }

    void disp(){
        if(head==null){
            System.out.print("List is empty");
        }else{
            System.out.print(head.data+" ");
            temp=head.next;
            while(temp!=head){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String args[])
    {
        //Try out your code here
        //System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        cir_list obj=new cir_list();
        int n=sc.nextInt();
        obj.ins(n);
        while(sc.hasNext()){
            int c=sc.nextInt();
            if(c==1){
                n=sc.nextInt();
                obj.ins(n);
            }else{
                obj.disp();
            }
        }
    }
}
