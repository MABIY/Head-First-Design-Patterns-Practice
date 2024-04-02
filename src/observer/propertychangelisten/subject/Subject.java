package observer.propertychangelisten.subject;

import observer.weather.observerdisplay.Observer;

import java.beans.PropertyChangeListener;

/**
 * @author lh
 */
public interface Subject {
    public void addPropertyChangeListener(PropertyChangeListener listener);
    public void addPropertyChangeListener(String propertyName,PropertyChangeListener listener);
    public void removePropertyChangeListener(PropertyChangeListener listener);
    public void removePropertyChangeListener(String propertyName,PropertyChangeListener listener);
}
