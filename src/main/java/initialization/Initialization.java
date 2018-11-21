package initialization;

/**
 * Created by Administrator on 2018\11\21 0021.
 */
public class Initialization {

    private String str1 = "str1";
    private String str2;

    public Initialization() {
        System.out.println(str1);
        System.out.println(str2);
        str2 = "str2";
    }

    public static void main(String[] args) {
        Initialization initialization = new Initialization();
    }
}
