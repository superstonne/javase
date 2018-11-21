package initialization;

/**
 * Created by Administrator on 2018\11\21 0021.
 */
public class BigObject {

    private byte[] HUN_MB = new byte[1024 * 1024];
    private static int i;

    public BigObject() {
        i++;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Big Object has been cleaned by " + Thread.currentThread() );
    }
}
