package SingletonPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 加锁式单例（保证线程安全，执行效率降低）
 */
public class Singleton2 {
    private static Singleton2 instance;
    private int count; // 访问次数

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        // 如果访问时问创建实例对象，则创建
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public int getCount() {
        return ++count;
    }
}
