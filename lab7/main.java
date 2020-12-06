import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import lab7_radix_sorts.*;


class Program {
    public static Integer[] toIntArr(ArrayList<Integer> arrlist){
        Integer[] res = new Integer[arrlist.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = arrlist.get(i);
        }
        return res;
    }


    public static void main(String[] args) {

        RadixSortsTestSuite tests = new RadixSortsTestSuite();
        tests.Run();

    }
}











