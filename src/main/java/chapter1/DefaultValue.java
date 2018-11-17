package chapter1;

/**
 * Created by Administrator on 2018\11\17 0017.
 */
public class DefaultValue {

    private int age;
    private char name;

    public static void main(String[] args) {
        DefaultValue defaultValue = new DefaultValue();
        System.out.println(defaultValue.age);
        System.out.println(defaultValue.name == '\u0000');
        System.out.println('\u0000');
        System.out.println(String.valueOf('\u0000'));
    }
}
