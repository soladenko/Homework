package Module7;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Measure {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<String> list3 = new LinkedList<>();
        List<Integer> list4 = new LinkedList<>();

        System.out.println("add");
        add(list1,1000, "Sergey");
        add(list1,1000000,"Sergey");
        add(list2,1000,10);
        add(list2,1000000,10);
        add(list3,1000,"Sergey");
        add(list3,1000000,"Sergey");
        add(list4,1000,10);
        add(list4,1000000,10);
        System.out.println();

        System.out.println("Set");
        add(list1,1000, "Sergey");
        add(list1,1000000,"Sergey");
        add(list2,1000,10);
        add(list2,1000000,10);
        add(list3,1000,"Sergey");
        add(list3,1000000,"Sergey");
        add(list4,1000,10);
        add(list4,1000000,10);
        System.out.println();

        System.out.println("Get");
        add(list1,1000, "Sergey");
        add(list1,1000000,"Sergey");
        add(list2,1000,10);
        add(list2,1000000,10);
        add(list3,1000,"Sergey");
        add(list3,1000000,"Sergey");
        add(list4,1000,10);
        add(list4,1000000,10);
        System.out.println();

        System.out.println("Remove");
        add(list1,1000, "Sergey");
        add(list1,1000000,"Sergey");
        add(list2,1000,10);
        add(list2,1000000,10);
        add(list3,1000,"Sergey");
        add(list3,1000000,"Sergey");
        add(list4,1000,10);
        add(list4,1000000,10);
        System.out.println();



    }

    static void add(List list, Integer j, int number) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < j; i++) {
            list.add(number);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " ");
    }

    static void add(List list, Integer j, String text) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < j; i++) {
            list.add(text);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " ");


    }

    static void add(List list, Integer j) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < j; i++) {
            list.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " ");
    }

    static void set(List list, Integer j, int number) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < j; i++) {
            list.set(i, number);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " ");
    }

    static void set(List list, Integer j, String text) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < j; i++) {
            list.set(i, text);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " ");
    }

    static void remove(List list, Integer j) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < j; i++) {
            list.remove(0);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " ");
    }
}
