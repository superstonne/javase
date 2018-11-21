package initialization;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018\11\21 0021.
 */
public class Garbage {
    public static Map mp = new HashMap();
    public static void main(String[] args) {
        while (true) {
            BigObject bigObject = new BigObject();
        }
    }
}
