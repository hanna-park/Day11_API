package com.pp.stringTokenizer;

import java.util.ArrayList;
import java.util.StringTokenizer;

// import java.util.*; //java.util 안에 있는 모든 클래스\

public class Test1 {
	
	public static void main(String[] args) {
		//파싱
		String str = "iu, 27, suji, 24, choa, 30, hani, 25";
		StringTokenizer st = new StringTokenizer(str,", ");
		
		while(st.hasMoreTokens()) {
			
			String s = st.nextToken(); // 문자열 파싱
			String age = st.nextToken();
			System.out.println("이름:" + s);
			System.out.println("나이:" +age);
			
		}
		
	}

}
