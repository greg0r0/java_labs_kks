package lab2_linked_list;

import lab2_linked_list.*;

public class LList<T>{

    private LListNode<T> first_element;
    private LListNode<T> last_element;
    private int list_length;

    //пустой конструктор
    public LList(){};

    //инициализирующий конструктор
    public LList(LListNode<T> node){
        list_length = 1;
        first_element = node;
        last_element = null;
    }

    private LList(LListNode<T> fe, LListNode<T> se, int len) {
        list_length   = len;
        first_element = fe;
        last_element  = se;

        first_element.setNextNode(last_element);
    }
    //конструктор копирования
    public LList(LList<T> another_list){
        this(another_list.first_element, another_list.last_element, another_list.list_length);
    }

    //Задать входной элемент списка
    public void setFirstNode(LListNode<T> node){
        node.setNextNode(first_element);
        first_element = node;
    }

    //Задать выходной элемент списка
    public void setLastNode(LListNode<T> node){
        if (list_length == 1){
            first_element.setNextNode(node); //костыль из-за last_node
            last_element = node;
        }
        last_element.setNextNode(node);
        node.setNextNode(null);
    }

    //удалить последний элемент списка
    public void deleteLastNode(){
        LListNode<T> node = first_element;
        while (node.getNextNode().getNextNode() != null) // у след ноды проверяем наличие след ноды 0-о
        {
            node = node.getNextNode();
        }
        node.setNextNode(null);
    }

    //Получить количество элементов в списке
    public int getLength(){
        return this.list_length;
    }

    //удаление списка
    public void deleteList(){
        //боже, благослови Garbage Collector
        first_element = null;
    }

    //DEBUG: вывод цепочки
    private void out(LListNode<T> node){
        System.out.print( node.getData() );
        if (node.getNextNode() != null){
            System.out.print(" -> ");
            out(node.getNextNode());
        } else {
            System.out.println();
        }
    }

    public void PrintRope(){
        out(first_element);
    }

}
