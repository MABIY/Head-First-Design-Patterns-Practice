package observer.weatehrobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lh
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof  WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
         + "F degress and " + humidity + "% humidity");
    }
}
