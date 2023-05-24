package org.example;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class DatePart {
    private Date fromDate = null;
    private SimpleDateFormat formatter = null;
    public DatePart(Date anyDate) {
        fromDate = anyDate;
        fromDate = new SimpleDateFormat ("EEE MMM dd hh mm ss yyyy",);
        Locale.getDefault();
    }
    public int getDay() {
        formatter.applyPattern("d");
        return Integer.parseInt(formatter.format(fromDate));
    }
    public int getMonth() {
        formatter.applyPattern("M");
        return Integer.parseInt(formatter.format(fromDate));
    }
    public int getYear() {
        formatter.applyPattern("y");
        return Integer.parseInt(formatter.format(fromDate));
    }
    public int hetHour() {
        formatter.applyPattern("h");
        return Integer.parseInt(formatter.format(fromDate));
    }
    public int getMinute() {
        formatter.applyPattern("m");
        return Integer.parseInt(formatter.format(fromDate));
    }

}
