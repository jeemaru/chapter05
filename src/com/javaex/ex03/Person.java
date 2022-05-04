package com.javaex.ex03;

public class Person {

	private String name;
	private String hp;
	private String of;
	
	
	public Person() {
		super();
	}
	public Person(String name, String hp, String of) {
		super();
		this.name = name;
		this.hp = hp;
		this.of = of;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getOf() {
		return of;
	}
	public void setOf(String of) {
		this.of = of;
	}
	
	
	public void drow() {
		System.out.println("이름:"+ name);
		System.out.println("이름:"+ hp);
		System.out.println("이름:"+ of);
	}
	
	
	
}
