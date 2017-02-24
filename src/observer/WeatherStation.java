package observer;

/**
 * Created by wyb on 17/2/13.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasuremernt(80, 65, 30.4f);
        weatherData.setMeasuremernt(82, 70, 29.2f);
        weatherData.setMeasuremernt(78, 90, 29.2f);
    }
}
