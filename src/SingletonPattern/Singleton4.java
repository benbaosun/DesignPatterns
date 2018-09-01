package SingletonPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 双重检查加锁单例（保证线程安全，可减少使用同步）
 */
public class Singleton4 {
    private volatile static Singleton4 instance;
    private int count; // 访问次数

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                instance = new Singleton4();
            }
        }
        return instance;
    }

    public int getCount() {
        return ++count;
    }
}
