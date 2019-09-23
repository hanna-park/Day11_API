package com.pp.collection.ex3;

import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
		
	}

	
	//날씨 정보를 파싱해서 저장
	public void init() {
		StringTokenizer st = new StringTokenizer(sb.toString(),"-");
		
		
	}
	
	//날씨 정보를 입력받아서 추가
	public void addWeather() {
		
		
	}
	
	//도시명을 입력받아서 해당  Weather 검색
	public void findWeather() {
		
		
	}
	
}
