import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    LL l=new LL();
    l.insertLast(3);
        l.insertLast(2);
        l.insertLast(1);
        l.insertLast(17);
        l.display();

        LL l2=new LL();
        l2.insertFirst(3);
        l2.insertFirst(2);
        l2.insertFirst(1);
        l2.insertFirst(17);
        l2.display();
    }
}