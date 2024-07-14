
import java.util.Scanner;
import java.util.Vector;

//Define the node class linked list

class Node{
    int data;
    Node next;
    Node (int x )
    {
        data = x;
        next = null;
    }
}


public class LinkedList

{
    //Function to add new node in linked list
    static void pushNode(Node[] head_ref, int data_val){

         Node new_node = new Node(data_val);

         new_node.next = head_ref[0];

         head_ref[0] = new_node;

    }


static int getMiddle(Node head)
{
    Vector<Integer> v = new Vector<>();

    while(head != null)
    {
        v.add(head.data);
        head = head.next;

    }

    int midindex = v.size()/2;

    return v.get(midindex);

}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Initialize the head of the linked list
    Node[] head = new Node[1];

    System.out.println("Enter numbers to add to the linked list (enter -1 to stop):");
    while (true) {
        int val = sc.nextInt();
        if (val == -1) {
            break;
        }
        pushNode(head, val);
    }

    // Print the middle value of the linked list
    System.out.println("Middle Value Of Linked List is: " + getMiddle(head[0]));
}
}