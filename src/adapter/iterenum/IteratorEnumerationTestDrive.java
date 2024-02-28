package adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @author lh
 */
public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(Arrays.asList(args));
        Enumeration<String> enumeration = new IteratorEnumeration<>(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
