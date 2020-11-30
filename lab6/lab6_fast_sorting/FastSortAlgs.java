package lab6_fast_sorting;

public class FastSortAlgs{
    public static <T extends Comparable<T>> void qsort(T a[]) {
           qsort(a,0,a.length-1);
    }

    public static <T extends Comparable<T>> void qsort(T a[], int sleft, int sright) {
        if (sleft < sright)
        {
            //make partition
            T pivot = a[(sleft + sright) / 2];
            int left = sleft;
            int right = sright;

            while (left <= right) {

                while (a[left].compareTo(pivot) < 0) {
                    left++;
                }
                while (a[right].compareTo(pivot) > 0) {
                    right--;
                }


                if (left <= right) {
                    T t = a[left];
                    a[left] = a[right];
                    a[right] = t;
                    left++;
                    right--;

                }
            }

            qsort(a, sleft, left-1);
            qsort(a, left, sright);
        }
    }

    public static <T extends Comparable<T>> void heap_sort(T arr[]){
        int n= arr.length-1;
        for (int i = n/2; i >=0; i--)
            heap_rebalance(arr, i, n);
        for (int i = n; i >= 0; i--){
            //swap
            T t = arr[0];
            arr[0] = arr[n];
            arr[n] = t;
            n--;
            heap_rebalance(arr, 0, n);
        }
    }

    private static <T extends Comparable<T>> void heap_rebalance(T arr[], int pos, int size){
        int a = 2*pos+1;
        int b = 2*pos+2;
        int largest_el = pos;

        if (a <= size)
            if (arr[a].compareTo(arr[largest_el]) > 0){
                largest_el = a;
            }
        if (b <= size)
            if ( arr[b].compareTo(arr[largest_el]) > 0){
                largest_el = b;
            }

        if (largest_el != pos) {
            //swap
            T t = arr[pos];
            arr[pos] = arr[largest_el];
            arr[largest_el] = t;

            heap_rebalance(arr, largest_el, size);
        }
    }
}
