package com.pp.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest4 {
	
	public static void main(String[] args) {
		//닭다리 쿠션(40%), 최신 핸드폰(10%), 은갈치 넥타이(50%)
		Random random = new Random();
		ArrayList<String> gift = new ArrayList<String>();
		
		gift.add("닭다리 쿠션");
		gift.add("닭다리 쿠션");
		gift.add("닭다리 쿠션");
		gift.add("닭다리 쿠션");
		gift.add("최신 핸드폰");
		gift.add("은갈치 넥타이");
		gift.add("은갈치 넥타이");
		gift.add("은갈치 넥타이");
		gift.add("은갈치 넥타이");
		gift.add("은갈치 넥타이");
		
		
		
		System.out.println(gift.get(random.nextInt(10)));
		
	}

}
