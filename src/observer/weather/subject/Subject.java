package observer.weather.subject;

import observer.weather.observerdisplay.Observer;

/**
 * @author lh
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
