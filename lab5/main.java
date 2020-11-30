

class Program{

    public static void buble_sort(int[] c){
        for (int i = 0; i < c.length; i++){
            for (int j = c.length-1; j >i;j--)
            {
                if (c[j] < c[j-1]) {
                int tmp = c[i];
                c[i] = c[j];
                c[j] = tmp;         }
            }
        }
    }

    public static void insert_sort(int[] c){
        for (int i = 1; i < c.length; i++){
            int value = c[i];
            int el = i - 1;
            for (; el>=0; el--) {
                if (value < c[el]) {
                    c[el + 1] = c[el];
                } else {
                    break;
                }
            }
            c[el+1] = value;
        }
    }

    public static void selection_sort(int[] c){
        for (int i = 0; i < c.length; i++){
            int minn = i;

            for (int j = i; j < c.length; j++){
                if (c[j] < c[minn]){
                    minn = j;
                }
            }
            //swap
            int tmp = c[i];
            c[i] = c[minn];
            c[minn] = tmp;
        }
    }

    public static void prnt(int[] c){
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
    public static void main(String[] args)
    {
        int[] c = {13, 2,3,7,6,4,1,2,3,45,6};
        insert_sort(c);
        prnt(c);

    }

}
