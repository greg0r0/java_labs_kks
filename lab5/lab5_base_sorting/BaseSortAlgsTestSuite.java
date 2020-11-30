package lab5_base_sorting;

import java.lang.reflect.Method;
import java.util.Random;

public class BaseSortAlgsTestSuite {

    private static Integer[] arr = null;

    public BaseSortAlgsTestSuite(){
        this.arr = gen_arr();
    }

    public static void Run() {
        Method[] tests = BaseSortAlgsTestSuite.class.getMethods();
        int succ_test = 0;
        int tests_num = 0;
        for (Method test : tests) {
            String test_name = test.getName();
            if (test_name.startsWith("Test")) {
                tests_num++;
                try {
                    long stTime = System.nanoTime();
                    if ((boolean) test.invoke(null)) {
                        System.out.println(String.format("[+] <%s> passed successfully", test_name));
                        succ_test++;
                    } else {
                        System.out.println(String.format("[-] <%s> not passed", test_name));
                        //добавить как-то вывод того, что тестировалось и того, что ожидалось. Прокся-метод?
                    }
                    long endTime = System.nanoTime();
                    System.out.println(String.format(" └─< Time: %.2f sec >",((float)(endTime-stTime)/1_000_000_000.0)));
                } catch (Exception e) {
                    System.out.println("[!] Failed to run test " + test_name);
                }
            }
        }
        System.out.println(String.format("Amount of tests: %d  Passage: %.2f%%\n", tests_num, ((double) succ_test / tests_num) * 100));
    }

    private static <T extends Comparable<T>> boolean check_order(T arr[]){

        for (int i = 1; i < arr.length; i++){
            if (arr[i-1].compareTo(arr[i]) > 0){
                return false;
            }
        }

       return true;
    }
    private static Integer[] gen_arr(){
        Random rnd = new Random();
        Integer[] arr = new Integer[100000];
        for (int i = 0; i < 100000; i++){
            arr[i] = rnd.nextInt(20000);
        }
        return arr;
    }

    public static boolean TestSimple(){
        Double[] local = {1.1,2.2,3.3,4.4,5.5};
        return check_order(local);
    }

    public static boolean TestBubleSort()
    {
        Integer[] local_copy = BaseSortAlgsTestSuite.arr.clone();
        BaseSortAlgs.sort_buble(local_copy);
        return check_order(local_copy);
    }
    public static boolean TestInsertSort()
    {
        Integer[] local_copy = BaseSortAlgsTestSuite.arr.clone();
        BaseSortAlgs.sort_insert(local_copy);
        return check_order(local_copy);
    }
    public static boolean TestSelectionSort()
    {
        Integer[] local_copy = BaseSortAlgsTestSuite.arr.clone();
        BaseSortAlgs.sort_selection(local_copy);
        return check_order(local_copy);
    }

    public static boolean TestRangeBubleSort()
    {
        Integer[] local_copy = BaseSortAlgsTestSuite.arr.clone();

        return check_order(local_copy);
    }
    public static boolean TestRangeInsertSort()
    {
        Integer[] local_copy = BaseSortAlgsTestSuite.arr.clone();

        return check_order(local_copy);
    }
    public static boolean TestRangeSelectionSort()
    {
        Integer[] local_copy = BaseSortAlgsTestSuite.arr.clone();

        return check_order(local_copy);
    }

}
