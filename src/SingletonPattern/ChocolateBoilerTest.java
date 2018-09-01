package SingletonPattern;


/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 巧克力工厂测试类
 */
public class ChocolateBoilerTest {

    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill(); // 添加原料
        boiler.boil(); // 煮东西
        boiler.drain(); // 排出产品

        /*
            运行结果：
            在锅炉中填满巧克力和牛奶
            将锅炉内东西煮沸
            排出煮沸的巧克力和牛奶
         */
    }

}