package operator;

/**
 * Created by Administrator on 2018\11\17 0017.
 */
public class Equals {
    private int age;

    public static void main(String[] args) {
        Equals a = new Equals();
        Equals b = new Equals();
        System.out.println(a == b);
        System.out.println(a.equals(b));

        int c = 01;
        System.out.println(Integer.toBinaryString(11));
        System.out.println(Integer.toHexString(11));

        float money = 1.1e2f;
        System.out.println(money);

        double m = 1.2e2d;
        System.out.println(m);

        System.out.println(1 >> 1);
        System.out.println(1 << 1);

    }

    @Override
    public boolean equals(Object obj) {

        return this.age == ((Equals) obj).age;
    }
}
