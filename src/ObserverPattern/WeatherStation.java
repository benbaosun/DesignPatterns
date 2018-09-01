package ObserverPattern;

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

        weatherData.setMeasurements(80, 65, 30.5f);
        weatherData.setMeasurements(82, 43, 29.3f);
        weatherData.setMeasurements(70, 58, 28.7f);
    }

}
