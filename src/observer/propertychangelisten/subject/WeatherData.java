package observer.propertychangelisten.subject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author lh
 */
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private PropertyChangeSupport propertyChangeSupport;

    public WeatherData() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(propertyName,listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(propertyName,listener);
    }

    public void measurementsChanged() {
    }

    public void setMeasurements(float temperature, float humidity,float pressure) {
        propertyChangeSupport.firePropertyChange("temperature",this.temperature,temperature);
        propertyChangeSupport.firePropertyChange("humidity",this.humidity,humidity);
        propertyChangeSupport.firePropertyChange("pressure",this.pressure,pressure);
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }
}
