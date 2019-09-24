package com.pp.calendar;

import java.util.Calendar;

public class CalendarTest2 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		int year =calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		calendar.set(Calendar.YEAR,2020);
		year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		int d = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(d);
		
		calendar.set(Calendar.MONTH,10); // 월은 0부터라서 -1씩 하기
		d= calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(d);
		
	}

}
