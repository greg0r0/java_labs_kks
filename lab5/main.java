
import lab5_base_sorting.*;

class Program{

    public static void print_arr(int[] c){
        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {123,12,3,123,4,123,123,3411,34,3467,3,513,1,55,2,51,41,33,21};
        BaseSortAlgs.sort_selection(arr);
        print_arr(arr);
    }

}
