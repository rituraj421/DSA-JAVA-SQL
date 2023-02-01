package BASICS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
// import java.util.TimeZone;

public class hashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> mh = new HashSet<>(6, 0.5f);
        mh.add(5);
        mh.add(6);
        mh.add(5);
        System.out.println(mh);

        // date and time 
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        System.out.println(Short.MAX_VALUE);

        Date d = new Date();
        System.out.println(d);

        //calender 
        // calender class is an abstract class

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(Calendar.DATE);
        System.out.println(Calendar.SECOND);
        System.out.println(Calendar.HOUR_OF_DAY);
        System.out.println(Calendar.HOUR);

        // Calendar cs = Calendar.getInstance( TimeZone.getTimeZone("Asia/Singapore"));
        // System.out.println(cs.getCalendarType());
        // System.out.println(cs.getTimeZone());

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        String myDate = dt.format(df);
        System.out.println(myDate);

    }
}