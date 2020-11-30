
import lab5_base_sorting.*;

import java.awt.*;

class Program{

    public static void print_arr(Integer[] c){
        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }

    public static void main(String[] args)
    {
        Integer[] arr = {123,12,3,123,4,125,124,3411,34,3467,3,513,1,55,2,51,41,33,21};
        BaseSortAlgs.<Integer>sort_selection(arr);
        print_arr(arr);
    }

}
