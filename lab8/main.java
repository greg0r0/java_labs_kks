
import lab8_linked_list_iterator.*;

import java.util.Iterator;

class Program{
    public static void main(String[] args)
    {
        LList<Integer> lst = new LList<>(new LListNode<Integer>(122, null), null, 1);
        lst.addLastNode(new LListNode<Integer>(123, null));
        lst.addLastNode(new LListNode<Integer>(124, null));
        lst.addLastNode(new LListNode<Integer>(125, null));
        lst.addLastNode(new LListNode<Integer>(126, null));
        lst.PrintRope();
        Iterator<Integer> iter = lst.iterator();
        do {
            System.out.println(iter.next());
        } while (iter.hasNext());
    }
}
