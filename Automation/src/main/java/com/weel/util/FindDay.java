package com.weel.util;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FindDay {

    public static Boolean isWeekend(String month, int day, int year) {
        Map map=new HashMap();
        //Adding elements to map
        map.put("January",0);
        map.put("February",1);
        map.put("March",2);
        map.put("April",3);
        map.put("May",4);
        map.put("June",5);
        map.put("July",6);
        map.put("August",7);
        map.put("September",8);
        map.put("Octuber",9);
        map.put("November",10);
        map.put("December",11);

        int numberMonth = (int) map.get(month);

        Calendar c = Calendar.getInstance();
        boolean  weekendDay = false;
        if(year > 2000 && year < 3000){
            c.set(year, (numberMonth-1), day);
        }
        String output = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())+"";

        if(output.contains("Sunday")){ weekendDay= true;}
        else if(output.contains("Saturday")){ weekendDay= true;}
        else{ weekendDay= false;}
        return weekendDay;
    }
}
