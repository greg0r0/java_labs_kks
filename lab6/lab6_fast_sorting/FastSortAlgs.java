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
}
