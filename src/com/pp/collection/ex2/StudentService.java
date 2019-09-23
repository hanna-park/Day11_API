package com.pp.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
	private Scanner sc;
	
	//이름을 입력해서 해당학생정보를 삭제
	public void studentDelete(ArrayList<Student> students, Student student){
		//students.remove(student);
		System.out.println("학생의 이름을 입력하세요.");
		String name = sc.next();
		
		for(int i=0; i< students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				students.remove(i);
				break;
			}
		}
	}
	
	
	//학생의 이름을 입력받아서 이름이 같은 학생을 리턴
	//
	public Student studentSearch(ArrayList<Student> students){
		sc = new Scanner(System.in);
		
		System.out.println("검색하고 싶은 학생의 이름을 입력하세요");
		String name = sc.next();
		Student student = null;
		for(int i=0;i<students.size();i++) {
			
			if(students.get(i).getName().equals(name)) {
				student= students.get(i);
				break;
				
			}
		}
		return student;
	}
	
	//학생의 정보 입력받기
	public void studentInput(ArrayList<Student> students) {
			
			sc = new Scanner(System.in);
		
			Student student = new Student();
			System.out.println("학생의 이름을 입력하세요");
			student.setName(sc.next());
			System.out.println("번호를 입력하세요");
			student.setNum(sc.nextInt());
			System.out.println("국어 점수를 입력하세요.");
			student.setKor(sc.nextInt());
			System.out.println("영어 점수를 입력하세요.");
			student.setEng(sc.nextInt());
			System.out.println("수학 점수를 입력하세요.");
			student.setMath(sc.nextInt());
			student.setSum(student.getKor()+student.getMath()+student.getEng());
			student.setAvg(student.getSum()/3.0);
			students.add(student);
		
		
	}

}
