package lab2_linked_list;

import java.lang.reflect.Method;

public class LListTestSuite
{
    public static void Run(){
        Method[] tests = LListTestSuite.class.getMethods();
        int succ_test = 0;
        int tests_num = 0;
        for (Method test: tests){
            String test_name = test.getName();
            if (test_name.startsWith("Test"))
            {
                tests_num++;
                try {
                    if ((boolean) test.invoke(null)){
                        System.out.println(String.format("[+] <%s> passed successfully", test_name));
                        succ_test++;
                    } else {
                        System.out.println(String.format("[-] <%s> not passed", test_name)); 
                        //добавить как-то вывод того, что тестировалось и того, что ожидалось. Прокся-метод?
                    }
                } catch (Exception e){
                    System.out.println("[!] Failed to run test " + test_name);
                }
            }
        }
        System.out.println(String.format("Amount of tests: %d  Passage: %.2f%%", tests_num, ((double)succ_test/tests_num)*100));
    }
    //тесты выгоядят отвратно, нужно продумать дизайн. 
    //some tests here
}