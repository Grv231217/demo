package Assignment10;

public class SList {
    Node head = null;

    SList() {
    }

    public SListIterator iterator() {
        return new SListIterator(this.head);
    }
}
