package lab2_linked_list;

import lab2_linked_list.*;

class Program{
    public static void main(String[] args)
    {
        LListNode<Integer> a = new LListNode<Integer>(1, null);
        LListNode<Integer> b = new LListNode<Integer>(2, null);
        LListNode<Integer> c = new LListNode<Integer>(3, null);
        LListNode<Integer> d = new LListNode<Integer>(4, null);
        LListNode<Integer> e = new LListNode<Integer>(5, null);
        LList<Integer> lst = new LList<Integer>(a, b, 2);
        lst.addLastNode(c);
        lst.addLastNode(d);
        lst.addLastNode(e);
        lst.PrintRope();
        try {
            lst.deleteByValue(3);
            lst.PrintRope();
            lst.deleteByValue(5);
            lst.PrintRope();
            lst.deleteByValue(1);
            lst.PrintRope();

            lst.deleteByValue(1337);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        lst.addFirstNode(c);
        lst.PrintRope();
        lst.deleteFirstNode();
        lst.PrintRope();
    }
}