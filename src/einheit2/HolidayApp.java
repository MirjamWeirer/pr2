package einheit2;

import java.util.Arrays;

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
    }
}
