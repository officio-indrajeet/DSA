package LinkedList;

public class DeleteFirstNode {

    Node  deleteHead(Node head) {
        if(head == null)
            return null;
        return head.next;
    }
}
