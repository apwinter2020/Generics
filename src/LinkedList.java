public class LinkedList<T> {

    ListNode<T> head;
    int size;

    LinkedList() {
        this.head = null;
        size = 0;
    }

    void pushFront(T newItem) {
        if(head == null) {
            head = new ListNode<>(newItem);
        }
        else {
            ListNode<T> newNode = new ListNode<>(newItem);
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    void print() {
        ListNode<T> currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
            if(currentNode != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
