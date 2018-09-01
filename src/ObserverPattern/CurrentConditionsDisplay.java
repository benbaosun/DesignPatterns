package ObserverPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 当前天气布告栏（观察者）
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature; // 温度
    private float humidity; // 湿度
    private Subject weatherData; // 天气数据（主题）

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // 把当前布告栏加入观察者
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("【实况信息】温度：%s度，湿度：%s", temperature, humidity));
    }

}
