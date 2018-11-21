package operator;

/**
 * Created by Administrator on 2018\11\17 0017.
 */
public class Operator {

    public static void main(String[] args) {
        int a = +9;
        int b = -2;
        System.out.println(a--);
        System.out.println(b++);
        a%=3;
        System.out.println(a);
        String d = new String("a");
        compare("a", "a");
        compare(new String("a"), new String("a"));
        compare(d, d);

        System.out.println('a' + 1);
        System.out.println('a' * 'a');

        System.out.println(Integer.MAX_VALUE  + 1);
    }

    public static void compare(String a, String b) {
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
