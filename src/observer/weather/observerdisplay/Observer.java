package observer.weather.observerdisplay;

/**
 * @author lh
 */
public interface Observer {
    public void update(float temp,float humidity,float pressure);
}
