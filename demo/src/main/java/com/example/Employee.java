
package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String Day;
	private String time;
	

	private Employee() {}

	public Employee(String firstName, String lastName, String Day, String time) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.Day = Day;
		this.time = time;
	}
}
