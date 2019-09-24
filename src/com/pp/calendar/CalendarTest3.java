package com.pp.calendar;

import java.util.Calendar;

public class CalendarTest3 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		//택배
		//현재의 년 월 일
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		
		System.out.println("오늘은 "+year+"년 "+month+"월 "+date+"일 입니다.");
		
		//이틀 뒤의 년 월 일
		//calendar.roll(Calendar.DATE,10); 
		// calendar.set(Calendar.DATE,date+2);
		calendar.add(Calendar.DATE,10);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		date = calendar.get(Calendar.DATE);
		
		System.out.println("도착 날짜는 "+year+"년 "+month+"월 "+date+"일 입니다.");
		
		
	}

}
