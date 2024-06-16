package Doubly_Linked_List;

public class implementation_doubly_linked_list {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public class DoublyLinkedList {
        private Node head;
        private Node tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        implementation_doubly_linked_list outerClass = new implementation_doubly_linked_list();
        DoublyLinkedList list = outerClass.new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
    }
}



