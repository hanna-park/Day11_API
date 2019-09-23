package com.pp.collection.generic;

import java.util.ArrayList;

import javax.print.attribute.HashAttributeSet;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ProductMain {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Computer com = new Computer();
		NoteBook nb = new NoteBook();
		
		ArrayList<? extends Computer> ar = new ArrayList<Computer>();
		// Computer와 Computer를 상속받은 타입
		ar.add(nb)l
		
		/**
		//<Generic>
		ArrayList<Product> ar = new ArrayList<Product>();
		ar.add(tv);
		ar.add(com);
		
		ArrayList<Product> ar2 = new ArrayList<Product>();
		
		//ArrayList<ArrayList<Product>> ar3 = new ArrayList<ArrayList<Product>>();
		
		HashMap<String,ArrayList<<Product>> map = new HashMap<String,ArrayList<<Product>>
		**/
		
	}

}
