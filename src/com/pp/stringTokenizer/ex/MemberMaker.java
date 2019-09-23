package com.pp.stringTokenizer.ex;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberMaker {

	private String memberInfo;
	
	public MemberMaker() {
		this.memberInfo = "iu-iu-27-choa-choa-28-suji-suji-30";
		
	}
	
	public void makerMember() {
		//memberInfo의 내용을 파싱해서
		//Member 객체를 생성해서
		//모든 정보를 출력

		StringTokenizer st = new StringTokenizer(memberInfo,"-");
		ArrayList<Member> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			Member member =new Member();
			
			member.setId(st.nextToken());
			member.setName(st.nextToken());
			member.setAge(Integer.parseInt(st.nextToken()));
			ar.add(member);
			
		}
		
		for(int i=0;i<ar.size();i++) {
			System.out.println("ID: "+ar.get(i).getId());
			System.out.println("Name: "+ar.get(i).getName());
			System.out.println("Age: "+ar.get(i).getAge());
		}
		
	}
	
}
