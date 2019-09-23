package com.pp.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	
	private ArrayList<Student> students;
	
	public StudentMenu() {
		students = new ArrayList<Student>();
		
	}
	
	
	public void start() {
		
		//1. 학생 정보 등록
		//2. 학생 전체 정보
		//3. 학생 정보 조회 -이름으로 검색
		//4. 학생 정보 삭제
		//5. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		StudentView sv =new StudentView();
		StudentService ss = new StudentService();
		boolean check = true;
		while(check) {
			
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생 전체 정보 조회");
			System.out.println("3. 학생 정보 조회");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 프로그램 종료");
			
			int select = sc.nextInt();
			switch(select) {
				case 1 : 
					ss.studentInput(students);
					break;
				case 2:
					sv.view(students);
					break;
				case 3:
					Student student = ss.studentSearch(students);
					sv.view(student);
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
