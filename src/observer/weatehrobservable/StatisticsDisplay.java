package observer.weatehrobservable;

import observer.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lh
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Avg/Max/min temperature = " + (tempSum/ numReadings)
        + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData weatherData) {
            float temp = weatherData.getTemperature();
            tempSum +=temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if(temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }
}
