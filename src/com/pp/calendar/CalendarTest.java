package com.pp.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//현재 시간의 정보
		Calendar cal = Calendar.getInstance();
		//get
		int hour = cal.get(Calendar.HOUR); // 12시간 기준
		hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간 기준
		System.out.println(hour+"시");
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min+"분");
		int year = cal.get(Calendar.YEAR);
		System.out.println(year+"년");
		int mon = cal.get(Calendar.MONTH);
		System.out.println(mon+1+"월");
		int day =cal.get(Calendar.DATE);
		System.out.println(day+"일");
		
	}

}
