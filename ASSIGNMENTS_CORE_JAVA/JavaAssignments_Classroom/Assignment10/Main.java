package Assignment10;
public class Main {
    public static void main(String[] args) {
        SList list = new SList();
        SListIterator ll = new SListIterator();
        ll.insert(23);
        ll.insert(45);
        ll.insert(12);
        ll.insert(90);
        ll.printList();
        ll.remove();
        ll.printList();
    }
}
