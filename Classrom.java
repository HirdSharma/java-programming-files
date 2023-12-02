import java.util.*;
public class Classrom {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);

    }
}
