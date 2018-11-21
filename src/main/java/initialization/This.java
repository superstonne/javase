package initialization;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Administrator on 2018\11\21 0021.
 */
public class This {

    private String name;

    public This() {
        System.out.println();
    }

    public This(String name) {
        this.name = name;
    }

    public This(String name, int age) {
        this("");
    }

    public static void main(String[] args) {
        This t = new This();
        t.compare(t);
    }

    public void compare(This t) {
        System.out.println(this == t);
        main(new String[]{});
    }
}
