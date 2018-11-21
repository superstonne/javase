package process;

/**
 * Created by Administrator on 2018\11\19 0019.
 */
public class Process {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print(i++ + " ");
        } while (i < 100);
        System.out.println();
        i = 0;
        while (i < 100) {
            System.out.print(i++ + " ");
        }
        i = 0;
        System.out.println();
        for (test1(), test1(), test1(); i++ < 100; test2()) {
            System.out.println(i);
        }
        int j = 0;
        L1:
        for (; j < 10; j++) {
            break L1;
        }
        System.out.println(j);
    }

    public static void test1() {
        System.out.println("executed 1");
    }
    public static void test2() {
        System.out.println("executed 2");
    }
}
