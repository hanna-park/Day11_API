package com.pp.collection.list;

import java.util.ArrayList;

public class ListTest1 {
	
	public static void main(String[] args) {
		//1, 2, 3
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add("wow");
		
		ar.add(1,"two"); // 1번 인덱스에 two를 넣으세요
		ar.set(1, 10000);
		
		ar.remove(1);
		//ar.clear();
		int num = 10;
		Integer n=num;
		num=(int)ar.get(0);
		String name =(String)ar.get(3);
		
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
		}
	}

}
