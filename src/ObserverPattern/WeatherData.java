package ObserverPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 天气数据（气象局提供）
 * 该类将从气象局实时获取数据，并显示数据到布告板
 */

public class WeatherData {

    // 获取温度信息
    public int getTemperature() {
        return 32;
    }

    // 获取湿度信息
    public int getHumidity() {
        return 45;
    }

    // 获取气压信息
    public int getPressure() {
        return 55;
    }

    // 一旦气象测量更新，此方法会被调用
    public void measurementsChanged() {
    }

}
