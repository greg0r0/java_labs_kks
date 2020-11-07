package lab2_linked_list;

import lab2_linked_list.*;

class Program{
    public static void main(String[] args)
    {
        LListNode<Integer> a = new LListNode<Integer>(1, null);
        LListNode<Integer> b = new LListNode<Integer>(2, null);
        LList<Integer> lst = new LList<Integer>(a,b);
        LListNode<Integer> c = new LListNode<Integer>(3,null);
        lst.setLastNode(c);
        lst.PrintRope();
    }
}