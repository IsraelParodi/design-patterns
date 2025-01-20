package Observer;

import Observer.Observers.CurrentConditionsDisplay;
import Observer.Observers.ForecastDisplay;
import Observer.Observers.StatisticsDisplay;
import Observer.Subject.WeatherData;

// The observer pattern defines a one to many dependency between objects so that when
// one object changes state, all of its dependents are notified and updated automatically
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
