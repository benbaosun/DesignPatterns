package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 气象统计布告栏（观察者）
 */

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature; // 温度
    private float humidity; // 湿度
    private Observable observable; // 天气数据（主题）

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this); // 把当前布告栏加入观察者
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("【气象统计】温度：%s度，湿度：%s", temperature, humidity));
    }


}
