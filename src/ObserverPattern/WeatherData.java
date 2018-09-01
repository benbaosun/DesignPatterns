package ObserverPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 天气数据（气象局提供）
 * 该类将从气象局实时获取数据，并显示数据到三个布告板
 */

public class WeatherData {

    // 获取温度信息
    public float getTemperature() {
        return 32.6f;
    }

    // 获取湿度信息
    public float getHumidity() {
        return 45.7f;
    }

    // 获取气压信息
    public float getPressure() {
        return 55.5f;
    }

    // 一旦气象测量更新，此方法会被调用
    public void measurementsChanged() {
        // 分别获取温度、湿度、气压信息
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // 将当前天气状况分别更新到“目前状况”、“气象统计”、“天气预报”三个布告板
//        currentConditionsDisplay.update(temperature, humidity, pressure);
//        statisticsDisplay.update(temperature, humidity, pressure);
//        forecastDisplay.update(temperature, humidity, pressure);
    }

}
