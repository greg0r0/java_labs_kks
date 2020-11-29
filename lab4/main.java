
import lab4_binary_tree.*;
import java.util.Random;
class Program{

    public static void main(String[] args)
    {
        BinaryTree<Integer, Integer> bintree = new BinaryTree<>();
        final Random rnd = new Random();
        //bintree.insert(10,0);
        for (int i =0; i < 25; i++){
            System.out.println("\nROUND "+(i+1)+"\n");
            bintree.insert(-10+rnd.nextInt(20), i);
            bintree.PrintTree();
        }
        System.out.println("\nFinal");
        bintree.PrintTree();
    }

}
