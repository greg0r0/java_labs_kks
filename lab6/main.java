
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
//        FastSortAlgsTestSuite tests = new FastSortAlgsTestSuite();
//        tests.Run();
        Integer[] a = tests.arr;
        print_arr(a);
        FastSortAlgs.qsort(a,0,a.length-1);
        print_arr(a);
    }

}
