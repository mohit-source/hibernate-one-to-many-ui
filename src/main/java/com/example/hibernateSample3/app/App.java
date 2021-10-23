package com.example.hibernateSample3.app;

import com.example.hibernateSample3.dao.PersonDao;
import com.example.hibernateSample3.entity.Person;
import com.example.hibernateSample3.entity.Phone;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createPerson();
		display(3L);
	}

	public static void createPerson() {
		
		System.out.println("GIT");
		System.out.println("*********************Creating Person*************");
		Person person = new Person();
		person.setName("John Doe");
		
		Phone phone = new Phone();
		phone.setNumber("866851950");
		
		Phone phone2 = new Phone();
		phone2.setNumber("7843080833");
		
		person.getPhones().add(phone);
		person.getPhones().add(phone2);
		
		PersonDao p = new PersonDao();
		p.savePerson(person);
	}
	
	public static void display(long id) {
		
		System.out.println("GIT Changes");
		System.out.println("*********************Displaying Person*************");
		
		PersonDao p = new PersonDao();
		
		Person person = p.getPerson(id);
		System.out.println(person.toString());
	}
	
}
