package lab4_binary_tree;

import java.lang.reflect.Method;

public class BinaryTreeTestSuite {
    public static void Run() {
        Method[] tests = lab4_binary_tree.BinaryTreeTestSuite.class.getMethods();
        int succ_test = 0;
        int tests_num = 0;
        for (Method test : tests) {
            String test_name = test.getName();
            if (test_name.startsWith("Test")) {
                tests_num++;
                try {
                    if ((boolean) test.invoke(null)) {
                        System.out.println(String.format("[+] <%s> passed successfully", test_name));
                        succ_test++;
                    } else {
                        System.out.println(String.format("[-] <%s> not passed", test_name));
                        //добавить как-то вывод того, что тестировалось и того, что ожидалось. Прокся-метод?
                    }
                } catch (Exception e) {
                    System.out.println("[!] Failed to run test " + test_name);
                }
            }
        }
        System.out.println(String.format("Amount of tests: %d  Passage: %.2f%%\n", tests_num, ((double) succ_test / tests_num) * 100));
    }
//тесты выгоядят отвратно, нужно продумать дизайн.
//some tests here
// public static boolean TestConstructor(){
//     LListNode<Integer> a = new LListNode<Integer>(1, null);
//     LListNode<Integer> b = new LListNode<Integer>(2, null);
//     LList<Integer> lst = new LList<Integer>(a,b,2);
//     return (lst.getLength() == 2);
// }
}
