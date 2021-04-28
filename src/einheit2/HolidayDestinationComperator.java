package einheit2;

import einheit2.Holiday;

import java.util.Comparator;

public class HolidayDestinationComperator implements Comparator<Holiday> {
    @Override
    public int compare(Holiday o1, Holiday o2) {
        return o1.getDestination().compareTo(o2.getDestination());
    }
}
