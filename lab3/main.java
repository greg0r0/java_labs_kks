package lab3_vector;

import java.util.Vector;

import lab3_vector.*;

class Program{
    public static void main(String[] args){
        lab3_vector.Vector<Integer> vec = new lab3_vector.Vector<Integer>();
        System.out.println(vec.getLen());
        for (int i = 0; i<=5; i++){
            vec.push(i);
            System.out.println(vec.getLen());
        }
        try{
            System.out.println(vec.pop());
            System.out.println(vec.getLen());
        } catch (Exception ex) {

        }
    }
}