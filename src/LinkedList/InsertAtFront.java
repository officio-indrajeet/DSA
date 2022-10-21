package LinkedList;

public class InsertAtFront {

    Node insertAtFront(Node head , int x) {

        if(head == null)
            return head;

        Node temp = new Node(x);
        temp.next = head;

        return temp;
    }
}
