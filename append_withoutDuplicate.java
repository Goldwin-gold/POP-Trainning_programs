/* Append without duplicates
John is a teacher, he has assigned a roll number to each student in ascending order. Every time he assigns a number to a student, he wants to check whether the number is already assigned to any other student. This is to avoid duplicates in the roll number. Add a number to the list only if the number is not previously present. Implement this concept using a Linked List. If the list is empty, print "List is empty".



Format:

Input:

The input consists of a list of integers. The negative value in the list indicates the end.

Output:

The output should be the list of numbers in separate lines.



Example:

Input:

11

22

33

22

33

44

-77

Output:

11

22

33

44


Case 1
Case 2
Input (stdin)
11
22
33
22
33
44
-77

Output (stdout)
11
22
33
44 */
import java.util.*;
class append_withoutDuplicate {
    Node head = null;
    Node temp = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void ins(int n) {
        Node nn = new Node(n);
        if (head == null) {
            head = nn;
            temp = nn;
        } else {
            temp.next = nn;
            temp = nn;
        }
    }

    void disp() {
        Node t = head;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        append_withoutDuplicate obj = new append_withoutDuplicate();
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            } else {
                obj.ins(n);
            }
        }
        obj.disp();
    }
}

