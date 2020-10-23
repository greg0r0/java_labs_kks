package lab2_linked_list;

import lab2_linked_list.*;

public class LList<T>{

    private LListNode<T> first_element;
    private LListNode<T> last_element;
    private int list_length;

    public LList(){};

    public LList(LListNode<T> fe, LListNode<T> se) {
        list_length   = 2;
        first_element = fe;
        last_element  = se;

        first_element.setNextNode(last_element);
    }

    public LList(LList<T> another_list){
        first_element = another_list.first_element;
        last_element = another_list.last_element;
        list_length = another_list.list_length;
    }

    public void setFirstNode(LListNode<T> node){
        node.setNextNode(first_element);
        first_element = node;
    }

    private void out(LListNode<T> node){
        System.out.print( node.getData() );
        if (node.getNextNode() != null){
            System.out.print(" -> ");
            out(node.getNextNode());
        }
    }

    public void PrintRope(){
        out(first_element);
    }

}
