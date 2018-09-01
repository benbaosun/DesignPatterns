package SingletonPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 巧克力工厂
 */
public class ChocolateBoiler {
    private boolean empty; // 是否锅炉为空
    private boolean boiled; // 是否在燃烧

    private static ChocolateBoiler instance; // 实例

    private ChocolateBoiler() {
        empty = true; // 设置锅炉为空
        boiled = false; // 设置未燃烧
    }

    // 获取实例对象
    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    // 加入原料
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 在锅炉中填满巧克力和牛奶
        }
    }

    // 排出产品
    public void drain() {
        // 锅炉非空，且在燃烧
        if (!isEmpty() && isBoiled()) {
            // 排出煮沸的巧克力和牛奶
            empty = true;
        }
    }

    // 煮东西
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 将锅炉内东西煮沸
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
