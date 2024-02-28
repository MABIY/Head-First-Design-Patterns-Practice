package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author lh
 */
public class EnumerationIterator<T> implements Iterator<T> {
    private Enumeration<T>  enumeration;

    public EnumerationIterator(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }
}
