package observer.propertychangelisten.test;


import observer.propertychangelisten.observerdisplay.CurrentConditionsDisplay;
import observer.propertychangelisten.observerdisplay.ForecastDisplay;
import observer.propertychangelisten.observerdisplay.HeatIndexDisplay;
import observer.propertychangelisten.observerdisplay.StatisticsDisplay;
import observer.propertychangelisten.subject.WeatherData;

/**
 * @author lh
 */
public class WeatherStationHeatIndex {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(62,90,28.1f);
    }
}
