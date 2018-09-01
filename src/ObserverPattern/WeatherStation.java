package ObserverPattern;

import ObserverPattern.observer.CurrentConditionsDisplay;
import ObserverPattern.observer.ForecastDisplay;
import ObserverPattern.observer.StatisticsDisplay;
import ObserverPattern.subject.WeatherData;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 气象站
 */

public class WeatherStation {

    public static void main(String[] args) {
        // 天气数据（主题）
        WeatherData weatherData = new WeatherData();

        // 创建三个布告栏（订阅者）
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // 进行测量，改变气象状况
        weatherData.setMeasurements(80, 65, 30.5f);
        weatherData.setMeasurements(82, 43, 29.3f);
        weatherData.setMeasurements(70, 58, 28.7f);

        /*
            运行结果：
            【天气预报】温度：80.0度，湿度：65.0
            【气象统计】温度：80.0度，湿度：65.0
            【实况信息】温度：80.0度，湿度：65.0
            【天气预报】温度：82.0度，湿度：43.0
            【气象统计】温度：82.0度，湿度：43.0
            【实况信息】温度：82.0度，湿度：43.0
            【天气预报】温度：70.0度，湿度：58.0
            【气象统计】温度：70.0度，湿度：58.0
            【实况信息】温度：70.0度，湿度：58.0
         */
    }

}
