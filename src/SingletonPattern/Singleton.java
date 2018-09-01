package SingletonPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 单例
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private int count; // 访问次数

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        return instance;
    }

    public int getCount() {
        return ++count;
    }
}
