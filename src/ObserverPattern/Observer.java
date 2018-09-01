package ObserverPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 观察者
 */

public interface Observer {
    /**
     * 更新布告栏
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temperature, float humidity, float pressure);
}
