package com.pp.test;

import java.util.Calendar;
import java.util.Scanner;

public class Menu {
	private Machine machine;
	private Scanner sc;
	
	public Menu() {
		machine = new Machine();
		sc = new Scanner(System.in);
	}
	
	public void select() {
		
		boolean check = true;
		
		
			System.out.println("1. Cola");
			System.out.println("2. Cider");
			System.out.println("3. Water");
			System.out.println("4. 종료");
			
			int select = sc.nextInt();
			Drink drink = null;
			
			if(select == 1) {
				drink = machine.makerCola();
			}else if(select == 2) {
				drink = machine.makerCider("Sprite",2000,Calendar.getInstance());
			}else if(select == 3) {
				drink = machine.makerWater();
			}else if(select == 4) {
				
			}
			
			System.out.println(drink.getBrand());
		
		
	}

}
