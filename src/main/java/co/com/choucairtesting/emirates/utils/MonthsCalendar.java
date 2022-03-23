package co.com.choucairtesting.emirates.utils;

import java.util.ArrayList;

public class MonthsCalendar {

    private static ArrayList<String> months= new ArrayList<>();

    public ArrayList<String> getMonths() {
        return months;
    }
    public static MonthsCalendar addMonths(){
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        return new MonthsCalendar();
    }


}
