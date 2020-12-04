package lab7_radix_sorts;

import java.util.ArrayList;

public class RadixSorts {
    public static void sort_msd(ArrayList<Integer> arr) {
        //get max digits count
        int max = 0;
        for (int i : arr) {

            String si = String.valueOf(i);
            if (si.length() > max) {
                max = si.length();
            }
        }
        //now with max digits count perform alg
        ArrayList<Integer> res_arr = new ArrayList<>();
        sortByDigit(arr, max ,res_arr);

        //fucking copy
        arr.clear();
        for (Integer nw : res_arr){
            arr.add(nw);
        }
    }

    private static void sortByDigit(ArrayList<Integer> arr, int n, ArrayList<Integer> res_arr) {
        if (arr.size() == 0 || n == 0) {
            return;
        }
        //разобраться почему некоторые элементы удваиваются (добавляются дважды)
        if (arr.size() == 1){
            res_arr.add(arr.get(0));
        }
        ArrayList<ArrayList<Integer>> digits_arrays = new ArrayList<>(10);
        for (int i = 0; i <= 9; i++) {
            digits_arrays.add(new ArrayList<>());
        }

        for (int c : arr) {
            int del = (int) Math.floor(Math.pow(10.0, (double) (n - 1)));
            int num = (c / del) % 10;
            digits_arrays.get(num).add(c);
        }
        //имеем digits_arrays с отсортированными по цифрам числами.
        for (ArrayList<Integer> subarr: digits_arrays){
            sortByDigit(subarr, n-1, res_arr);
            //System.out.println(subarr);
        }
        //System.out.println(digits_arrays);
    }
}
