package SingletonPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 急切式单例（保证线程安全）
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private int count; // 访问次数

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }

    public int getCount() {
        return ++count;
    }
}
