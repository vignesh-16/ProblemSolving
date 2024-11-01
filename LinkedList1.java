import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        Node $1 = new Node(1);
        Node $2 = new Node(2);
        Node $3 = new Node(3);
        $1.next = $2;
        $2.next = $3;
        list.push($1);
        list.push($2);
        list.push($3);
        printLinkedList(list);
    };
    public static void printLinkedList(LinkedList list) {
        Node head = new Node();
        for (int i=0; i<list.size(); i++) {
            Node n = ((Node)list.get(i));
            System.out.println(n.value);
        }
    }
}

class Node {
    int value;
    Node next;
    public Node() {

    }
    public Node(int value) {
        this.value = value;
    }
}
