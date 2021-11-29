package Assignment10;

public class SListIterator {
    Node head;
    public SListIterator()
    {
    }
    public SListIterator(Node head) {
        this.head = head;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node grv = this.head;
            while (grv.next != null) {
                grv = grv.next;
            }
            grv.next = newNode;
        }
    }

    public void remove() {
        if (this.head.next != null) {
            this.head = this.head.next;
        } else {
            this.head = null;
        }
    }

    public void printList() {
        Node temp = this.head;
        System.out.print("LinkedList: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
