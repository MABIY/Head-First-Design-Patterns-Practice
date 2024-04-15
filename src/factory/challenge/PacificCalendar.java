package factory.challenge;

import java.util.List;

/**
 * @author lh
 */
public class PacificCalendar extends Calendar {
    public PacificCalendar(ZoneFactory zoneFactory) {
        zone = zoneFactory.createZone("US/Pacific");
    }

    @Override
    public void createCalendar(List<String> appointments) {
        // make calendar from appointments
        System.out.println("Making the calendar");
    }
}
