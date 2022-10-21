package LinkedList;

public class InsertAtLast {

    Node insertAtLast(Node head , int x) {

        if(head == null)
            return head;

        Node temp = new Node(x);
        Node curr = head;

        while(curr.next != null)
            curr = curr.next;

        curr.next = temp;

        return head;
    }
}
