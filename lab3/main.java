package lab3_vector;

import lab3_vector.*;

class Program{
    public static void main(String[] args){
        VectorTestSuite tests = new VectorTestSuite();
        tests.Run();


        lab3_vector.Cat a = new Cat("Cat1", 1);
        lab3_vector.Cat b = new Cat("Cat2", 2);
        lab3_vector.Cat bb = new Cat(b);
        lab3_vector.Cat c = new Cat("Cat3", 3);
        lab3_vector.Cat d = new Cat("InsertedCat", 10);

        lab3_vector.Vector<lab3_vector.Cat> lst = new lab3_vector.Vector<>();
        lst.push(a);
        lst.push(b);
        lst.push(bb);
        lst.push(c);
        System.out.println(lst.toString());
        try {
            lst.insert(d, 1);
        } catch (Exception ex) {

        }
        System.out.println(lst.toString());
        try {
            lst.deleteByValue(b);
        } catch (Exception ex) {

        }
        System.out.println(lst.toString());
    }
}