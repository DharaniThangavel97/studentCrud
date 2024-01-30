package com.project.first.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentTable")
public class Student {
	   @Id
	   @GeneratedValue
		private Integer rollno;
		private String name;
		private String address;
		public Student() {
			super();
		}
		public Student(Integer rollno, String name, String address) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.address = address;
		}
		public Integer getRollno() {
			return rollno;
		}
		public void setRollno(Integer rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

}