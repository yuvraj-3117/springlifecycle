package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("staring method");
	}
	@PreDestroy   // post or pre yeah jabva 11 se remove he toh iski hmne dependency add ki he
	public void  end() {
		
		System.out.println("ending method");
	}

}
