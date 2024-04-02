package observer.propertychangelisten.observerdisplay;


import observer.propertychangelisten.subject.WeatherData;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author lh
 */
public class StatisticsDisplay implements PropertyChangeListener, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        float newValue = (float) evt.getNewValue();
        tempSum += newValue;
        numReadings++;
        if(newValue > maxTemp) {
            maxTemp = newValue;
        }

        if(newValue < minTemp) {
            minTemp = newValue;
        }

        display();
    }

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.addPropertyChangeListener("temperature",this);
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum/numReadings) + "/" + maxTemp + "/" + minTemp);
    }

}
