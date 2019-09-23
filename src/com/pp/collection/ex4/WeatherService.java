package com.pp.collection.ex4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	private Scanner sc;
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
		
	}

	
	//날씨 정보를 파싱해서 저장
	public HashMap<String, Weather> init() {
		StringTokenizer st = new StringTokenizer(sb.toString(),"-");

		//HashMap에 추가
		//키는 도시명, value weather
		//리턴은 HashMap
		
		HashMap<String, Weather> map =new HashMap<String, Weather>();

		while(st.hasMoreTokens()) {
			Weather weather = new Weather();
			weather.setCity(st.nextToken());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());
			map.put(weather.getCity(), weather);
		}
		
		return map;
	}
	
	//날씨 정보를 입력받아서 추가
	public void addWeather(HashMap<String, Weather> map) {
		sc = new Scanner(System.in);
		
		Iterator<String> add = map.keySet().iterator();
		
	}
	
	//도시명을 입력받아서 해당  Weather 검색
	public Weather findWeather(HashMap<String, Weather> map) {
		sc= new Scanner(System.in);
		System.out.println("도시명을 입력하세요.");
		String city = sc.next();
		Weather weather = map.get(city);
		
		return weather;
	}
	
	//도시명을 입력받아서 해당 정보(Weather)를 삭제
	public Weather deleteWeather(HashMap<String, Weather> map) {
		sc = new Scanner(System.in);
		System.out.println("삭제할 도시명을 입력하세요.");
		String city =sc.next();
		Weather weather = map.remove(city);
		
		return weather;
		
	}
	
}
