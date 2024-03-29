package com.pp.collection.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherMenu {
	
	private ArrayList<Weather> weathers;
	
	public WeatherMenu() {
		weathers = new ArrayList<Weather>;
	}

	//1. 날씨 정보 초기화 - init
	//2. 날씨 정보 추가 - addWeather
	//3. 전체 날씨 정보 - view
	//4. 지역 날씨 검색  - findWeather, view
	//5. 프로그램 종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		WeatherView wv= new WeatherView();
		boolean check =true;
		
		while(check) {
			
			System.out.println("1. 날씨 정보 초기화");
			System.out.println("2. 날씨 정보 추가");
			System.out.println("3. 전체 날씨 정보");
			System.out.println("4. 지역 날씨 검색");
			System.out.println("5. 프로그램 종료");
			
			int select = sc.nextInt();
			
			switch(select) {
				case 1:
					
					break;
				case 2:
					wv.view(weathers);
					break;
				case 3:
					wv.view(weather);
					break;
				case 4:
					
					break;
				case 5:
					check = !check;
					break;
			
			}
			
			
			
		}
		
		
	}
	
}
