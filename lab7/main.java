import java.util.ArrayList;
import java.util.Random;
import lab7_radix_sorts.*;

class Program {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++){
            arr.add(rnd.nextInt(1000));
        }
        System.out.println(arr);
        RadixSorts.sort_msd(arr);
        System.out.println(arr);
    }
}











