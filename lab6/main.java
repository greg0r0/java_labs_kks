
import lab6_fast_sorting.*;

class Program{

    public static void print_arr(Integer[] c){
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args)
    {
        FastSortAlgsTestSuite tests = new FastSortAlgsTestSuite();
        tests.Run();
//        Integer[] a = {8,9,3,2,4,1,201,234,234,42,34,12,3,4,23,4,43,4,5,6,4563,345,345,234};
//        print_arr(a);
//        print_arr(a);
    }

}
