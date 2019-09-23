package com.pp.collection.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class WeatherView {
	
	public void view(String str) {
		System.out.println(str);
	}

	//날씨 전체 정보 출력
	public void view(HashMap<String, Weather> map) {
		
		//1단계
		//키들을 모을  Iterator 생성
		Iterator<String> v = map.keySet().iterator();
		
		while(v.hasNext()) {
			String key = v.next();
			Weather weather = map.get(key);
			System.out.println("=========================");
			System.out.println("도시: "+weather.getCity());
			System.out.println("기온: "+weather.getGion());
			System.out.println("습도: "+weather.getHumidity());
			System.out.println("날씨: "+weather.getStatus());
		}
		
		/*for(int i=0;i<weathers.size();i++) {
			System.out.println("도시: "+weathers.get(i).getCity());
			System.out.println("기온: "+weathers.get(i).getGion());
			System.out.println("습도: "+weathers.get(i).getHumidity());
			System.out.println("날씨: "+weathers.get(i).getStatus());
		}*/
	}
	//날씨 하나 정보 출력
	public void view(Weather weather) {
		
		System.out.println("도시: "+weather.getCity());
		System.out.println("기온: "+weather.getGion());
		System.out.println("습도: "+weather.getHumidity());
		System.out.println("날씨: "+weather.getStatus());
		
		
	}
	
}
