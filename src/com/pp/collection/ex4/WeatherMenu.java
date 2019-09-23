package com.pp.collection.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WeatherMenu {
	
	private ArrayList<Weather> weathers;
	private WeatherView wv;
	private WeatherService ws;
	private HashMap<String, Weather> map;
	
	public WeatherMenu() {
		weathers = new ArrayList<Weather>();
		wv= new WeatherView();
		ws = new WeatherService();
		
	}

	//1. 날씨 정보 초기화 - init
	//2. 날씨 정보 추가 - addWeather
	//3. 전체 날씨 정보 - view
	//4. 지역 날씨 검색  - findWeather, view
	//5. 프로그램 종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check =true;
		
		while(check) {
			
			System.out.println("1. 날씨 정보 초기화");
			System.out.println("2. 날씨 정보 추가");
			System.out.println("3. 전체 날씨 정보");
			System.out.println("4. 지역 날씨 검색");
			System.out.println("5. 날씨 정보 삭제");
			System.out.println("6. 프로그램 종료");
			
			int select = sc.nextInt();
			
			switch(select) {
				case 1:
					map = ws.init();
					wv.view(map);
					break;
				case 2:
					ws.addWeather();
					
					break;
				case 3:
					wv.view(map);
					break;
				case 4:
					Weather weather = ws.findWeather(map);
					if(weather != null) {
						wv.view(weather);
					} else {
						wv.view("해당 지역의 정보가 없습니다.");
					}
					break;
				case 5:
					weather = ws.deleteWeather(map);
					if(weather != null) {
						wv.view("삭제 성공");
					}else {
						wv.view("삭제 실패");
					}
					
				case 6:
					check = !check;
					break;
			
			}
			
			
			
		}
		
		
	}
	
}
