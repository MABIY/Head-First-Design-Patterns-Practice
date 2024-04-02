package observer.propertychangelisten.observerdisplay;


import observer.propertychangelisten.subject.WeatherData;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author lh
 */
public class ForecastDisplay implements PropertyChangeListener, DisplayElement {
    public static final String PRESSURE_PROPERTY = "pressure";
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.addPropertyChangeListener(PRESSURE_PROPERTY,this);
        this.weatherData = weatherData;
    }


    @Override
    public void display() {
        System.out.print("Forecast: ");
        if(currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if(currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for  cooler, rainly weather");
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        lastPressure = currentPressure;
        currentPressure = (float)evt.getNewValue();
        display();
    }

    public void removePropertyListener(){
        weatherData.removePropertyChangeListener(PRESSURE_PROPERTY,this);
    }

}
