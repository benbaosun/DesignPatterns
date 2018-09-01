package SingletonPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 单例
 */
public class Singleton {
    private static Singleton instance;
    private int count; // 访问次数

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        // 如果访问时问创建实例对象，则创建
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getCount() {
        return ++count;
    }
}
