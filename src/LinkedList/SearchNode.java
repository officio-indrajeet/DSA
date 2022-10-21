package LinkedList;

public class SearchNode {

    int searchNode(Node head , int x) {

        int pos = 0;
        Node curr = head;
        while(curr != null) {
            if(curr.value == x) {
                return pos;
            }
            else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
}
