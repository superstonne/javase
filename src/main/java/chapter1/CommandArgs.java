package chapter1;

/**
 * Created by Administrator on 2018\11\17 0017.
 */
public class CommandArgs {

    public static void main(String[] args) {
        for (String param : args) {
            System.out.println(param);
        }
    }
}
