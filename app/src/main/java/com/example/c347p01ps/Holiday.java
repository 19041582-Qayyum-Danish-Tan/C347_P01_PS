package com.example.c347p01ps;

import java.util.Date;

public class Holiday {
    private String holidayName;
    private boolean icon;
    private String date;

    public Holiday(String holidayName, String date, boolean icon) {
        this.holidayName = holidayName;
        this.icon = icon;
        this.date = date;

    }
    public String getHolidayName() {
        return holidayName;
    }
    public  String getDate() {
        return  date;
    }
    public boolean showIcon() {
        return icon;
    }

}
