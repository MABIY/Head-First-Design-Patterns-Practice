package observer.propertychangelisten;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author lh
 */
public class PCLNewsChannel implements PropertyChangeListener {
    private String name;
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setName((String)evt.getNewValue());
    }

    public String getName() {
        return name;
    }

    public PCLNewsChannel setName(String name) {
        this.name = name;
        return this;
    }
}
