package ejm.chapter02.item05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Event {

    private final Date occurrence;

    public Event(Date occurrence) {
        this.occurrence = new Date(occurrence.getTime());
    }

    private static final Date RENAISSANCE_START;
    private static final Date RENAISSANCE_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1300, Calendar.JANUARY, 1, 0, 0, 0);
        RENAISSANCE_START = gmtCal.getTime();
        gmtCal.set(1600, Calendar.JANUARY, 1, 0, 0, 0);
        RENAISSANCE_END = gmtCal.getTime();
    }

    public boolean inRenaissance() {
        return occurrence.compareTo(RENAISSANCE_START) >= 0
            && occurrence.compareTo(RENAISSANCE_END) < 0;
    }

    public static void main(String[] args) {
        Event a = new Event(new Date(200000));
        System.out.println(a.inRenaissance());
    }

}
