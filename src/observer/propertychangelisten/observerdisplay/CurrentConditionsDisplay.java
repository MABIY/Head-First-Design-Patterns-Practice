package observer.propertychangelisten.observerdisplay;


import observer.propertychangelisten.subject.WeatherData;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author lh
 */
public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.addPropertyChangeListener("temperature",this);
        weatherData.addPropertyChangeListener("humidity",this);
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName();
        switch (propertyName) {
           case "temperature" :
               temperature = (float)evt.getNewValue();
               break;
            case "humidity":
                humidity = (float)evt.getNewValue();
                break;
        }
        display();
    }
}
