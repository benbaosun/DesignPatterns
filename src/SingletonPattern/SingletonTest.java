package SingletonPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 单例测试类
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("访问次数为：" + instance.getCount());

        instance = Singleton.getInstance();
        System.out.println("访问次数为：" + instance.getCount());

        instance = Singleton.getInstance();
        System.out.println("访问次数为：" + instance.getCount());

        /*
            运行结果
            访问次数为：1
            访问次数为：2
            访问次数为：3
         */
    }

}
