package com.example.demo;

public class Title {
	
	private People people;

	public void setPeople(People people) {
		this.people = people;
	}
	
	public void show(){
		this.people.showTitle();
	}
}
