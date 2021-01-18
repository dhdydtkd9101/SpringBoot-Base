package com.dhdydtkd.server.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.google.common.collect.Lists;

public class DateUtils {

    public static String dateToString(Date date, String dateformat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateformat, Locale.ENGLISH);
        String str = sdf.format(date);
        return str;
    }

    public static Date stringToDate(String dateStr, String dateformat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateformat, Locale.KOREAN);
        Date dt = new Date();
        try {
            dt = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dt;
    }

    public static String convertDateFormat(String dateStr, String dateformat){
        SimpleDateFormat sdf = new SimpleDateFormat(dateformat, Locale.ENGLISH);
        Calendar cal = Calendar.getInstance();
        String str = "";
        Date dt = null;
        try {
            dt = sdf.parse(dateStr);
            cal.setTime(dt);
            str = sdf.format(cal.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static String convertDateFormat(Date dt, String dateformat){
        SimpleDateFormat sdf = new SimpleDateFormat(dateformat, Locale.KOREAN);
        return sdf.format(dt);
    }

    public static List<String> getBetweenDays(String start_dt, String end_dt, String dateFormat){
        ArrayList<String> dates = Lists.newArrayList();
        Date currentDate = DateUtils.stringToDate(start_dt, dateFormat);
        Date endDate = DateUtils.stringToDate(end_dt, dateFormat);

        while (currentDate.compareTo(endDate) <= 0) {
            dates.add(DateUtils.dateToString(currentDate, dateFormat));
            Calendar c = Calendar.getInstance();
            c.setTime(currentDate);
            c.add(Calendar.DAY_OF_MONTH, 1);
            currentDate = c.getTime();
        }

        return dates;
    }

    public static String addMonth(String dateStr, String dateformat, int monthInterval){
        SimpleDateFormat sdf = new SimpleDateFormat(dateformat, Locale.ENGLISH);
        SimpleDateFormat df = new SimpleDateFormat(dateformat);
        Date dt;
        String str = "";
        Calendar cal = Calendar.getInstance();
        try {
            dt = sdf.parse(dateStr);
            cal.setTime(dt);
            cal.add(Calendar.MONTH, monthInterval);
            str = df.format(cal.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return str;
    }

    public static String modifyDay(String dateStr, String dateformat, int day){
        SimpleDateFormat sdf = new SimpleDateFormat(dateformat, Locale.ENGLISH);
        SimpleDateFormat df = new SimpleDateFormat(dateformat);
        Date dt;
        String str = "";
        Calendar cal = Calendar.getInstance();
        try {
            dt = sdf.parse(dateStr);
            cal.setTime(dt);
            cal.add(Calendar.DATE, day);
            str = df.format(cal.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return str;
    }

    public static String setTime(String dateStr, String dateformat, int time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        SimpleDateFormat df = new SimpleDateFormat(dateformat);
        Date dt;
        String str = "";
        Calendar cal = Calendar.getInstance();
        try {
            dt = sdf.parse(dateStr);
            cal.setTime(dt);
            cal.set(Calendar.HOUR, time);
            str = df.format(cal.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return str;
    }

    public static Calendar currentTime(){
        long time = System.currentTimeMillis();
        Date dt = new Date(time);
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        return cal;
    }

    public static Date currentTimeToDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREAN);
        Date dt = null;
        try {
            Calendar cal = Calendar.getInstance();
            String str = sdf.format(cal.getTime());
            dt = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dt;
    }

    public static Date currentTimeModifyDay(int day){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREAN);
        Date dt = null;
        try {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, day);
            String str = sdf.format(cal.getTime());
            dt = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dt;
    }

    public static String getPointTypeAsHyphenType(String exist_date) throws Exception {
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(exist_date);

		String format_date = new SimpleDateFormat("yyyy.MM.dd").format(date);

		return format_date;
	}

    public static String getTimeFormat(int time) {
		int hour = time;
		int minute = 0;
		int second = 0;

		LocalTime targetTime = LocalTime.of(hour, minute, second);

		String format_time = targetTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

		return format_time;
	}
    
    public static String getHyphenTypeDate(String exist_date) throws Exception {
    	Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(exist_date);

		String format_date = new SimpleDateFormat("yyyy-MM-dd").format(date);
		
		return format_date;
	}
    
}
