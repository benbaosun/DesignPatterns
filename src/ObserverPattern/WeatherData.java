package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 天气数据（主题，由气象局提供）
 * 该类将从气象局实时获取数据，并显示数据到三个布告板
 */

public class WeatherData implements Subject {
    private List<Observer> observerList; // 观察者列表
    private float temperature; // 温度
    private float humidity; // 湿度
    private float pressure; // 气压

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer); // 添加观察者到列表中
    }

    // 从观察者列表移除指定观察者
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(observer);
        }
    }

    // 通知所有观察者更新
    private void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // 一旦气象测量更新，此方法会被调用
    public void measurementsChanged() {
        notifyObservers(); // 通知所有观察者更新
    }

    // 设置测量的温度
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(); // 通知气象测量改变
    }

}
