package lab3_vector;

import java.util.Vector;

import lab3_vector.*;

class Program{
    public static void main(String[] args){
        lab3_vector.Vector<Integer> vec = new lab3_vector.Vector<Integer>();
        //System.out.println(vec.getLen());
        for (int i = 0; i<=5; i++){
            vec.push(i);
            //System.out.println(vec.getLen());
        }
        vec.printrope();
        try{
            vec.insert(15, 3);
            vec.printrope();
        } catch (Exception ex){

        }
        try{
            vec.delete(3);
            vec.printrope();
        } catch (Exception ex){

        }
    }
}