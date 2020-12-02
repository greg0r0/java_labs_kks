
import lab6_fast_sorting.*;

import java.lang.reflect.Array;
import java.util.Arrays;

class Program{

    public static void print_arr(Integer[] c){
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
    private static <T extends Comparable<T>> boolean check_order(T arr[], int left, int right){

        for (int i = left+1; i < right; i++){
            if (arr[i-1].compareTo(arr[i]) > 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        FastSortAlgsTestSuite tests = new FastSortAlgsTestSuite();
        tests.Run();
    }

}
                                            
