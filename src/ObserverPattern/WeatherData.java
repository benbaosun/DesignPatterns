package ObserverPattern;

import java.util.Observable;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 天气数据（主题，由气象局提供）
 * 该类将从气象局实时获取数据，并显示数据到三个布告板
 */

public class WeatherData extends Observable {
    private float temperature; // 温度
    private float humidity; // 湿度
    private float pressure; // 气压

    public WeatherData() {
    }

    // 一旦气象测量更新，此方法会被调用
    public void measurementsChanged() {
        setChanged(); // 调用父类方法，设置数据已改变（不调用无法执行更新）
        notifyObservers(); // 调用父类方法，通知所有观察者更新
    }

    // 设置测量的温度
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(); // 通知气象测量改变
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
