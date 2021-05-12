package einheit2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HolidayApp {
    public static void main(String[] args) {
        Holiday summerHoliday = new Holiday("Österreich",7,4);
        Holiday winterHoliday = new Holiday("Österreich",2,4);

        Holiday defaultHoliday = new Holiday(); // now the constructor without parameter
        summerHoliday.setNrPersons(3);
        System.out.println(summerHoliday.getNrPersons());
        System.out.println(summerHoliday);

        Holiday [] holiday ={new Holiday("Österreich",7,4),new Holiday("Österreich",7,2),new Holiday("Österreich",2,4)};
        System.out.println(Arrays.toString(holiday));
        Arrays.sort(holiday);
        System.out.println(Arrays.toString(holiday));
        System.out.println("------------");
        ArrayList<Holiday> holidays = new ArrayList<>();
        holidays.add(new Holiday("Österreich",7,4));
        holidays.add(new Holiday("Karibik",7,2));
        holidays.add(new Holiday("Dubai",2,4));
        holidays.add(new Holiday("Dubai",2,3));
        holidays.add(new Holiday("Deutschland",7,3));
        holidays.add(new Holiday("Deutschland",3,3));
        System.out.println(holidays);
        System.out.println("------------");
        Collections.sort(holidays, new HolidayDestinationComperator()); //only difference to compareTo we use class Collections
        System.out.println(holidays);
        System.out.println("------------");
        Collections.sort(holidays, new HolidayLengthComparator());
        System.out.println(holidays);
    }
}
