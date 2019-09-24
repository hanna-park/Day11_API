package com.pp.test;

import java.util.Calendar;

public class Machine {
	//콜라 선택
		public Cola makerCola() {
			Cola cola = new Cola();
			cola.setBrand("CocaCola");
			cola.setPrice(1500);
			cola.setCalendar(Calendar.getInstance());
			return cola;
		}
		
		//사이다
		public Cider makerCider(String brand,int price, Calendar calendar) {
			Cider cider = new Cider();
			cider.setBrand(brand);
			cider.setPrice(price);
			cider.setCalendar(calendar);
			return cider;
		}
		
		//물
		public Water makerWater() {
			return new Water();
		}
		
}
