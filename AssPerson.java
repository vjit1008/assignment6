package com.assignment6;

import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
	this.name = name;
	this.age = age;
    }
}

class Employee extends Person {
    int id;
    int sal;

    Employee(String name, int age, int id, int sal) {
	super(name, age);
	this.id = id;
	this.sal = sal;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", sal=" + sal + ", name=" + name + ", age=" + age + "]";
    }

}

class Teacher extends Employee {
    String subject;

    Teacher(String name, int age, int id, int sal, String subject) {
	super(name, age, id, sal);
	this.subject = subject;
    }

    @Override
    public String toString() {
	return "Teacher [subject=" + subject + ", id=" + id + ", sal=" + sal + ", name=" + name + ", age=" + age + "]";
    }

}

class Principal extends Teacher {
    int experience;

    Principal(String name, int age, int id, int sal, String subject, int experience) {
	super(name, age, id, sal, subject);
	this.experience = experience;
    }

    @Override
    public String toString() {
	return "Principal [experience=" + experience + ", subject=" + subject + ", id=" + id + ", sal=" + sal
		+ ", name=" + name + ", age=" + age + "]";
    }

}

class Officer extends Employee {
    String dept;

    Officer(String name, int age, int id, int sal, String dept) {
	super(name, age, id, sal);
	this.dept = dept;
    }

    @Override
    public String toString() {
	return "Officer [dept=" + dept + ", id=" + id + ", sal=" + sal + ", name=" + name + ", age=" + age + "]";
    }

}


public class AssPerson {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Teacher t1 = new Teacher("Ram", 45, 294, 35000, "Math");
	Teacher t2 = new Teacher("Shyam", 32, 175, 41000, "Chemisry");
	Teacher t3 = new Teacher("Suresh", 52, 235, 72000, "Physics");

	Principal p1 = new Principal("Ramesh", 57, 563, 95000, "History", 32);

	Officer o1 = new Officer("Anil", 44, 102, 47000, "Engineering");

	Employee[] e = new Employee[5];

	e[0] = t1;
	e[1] = t2;
	e[2] = t3;
	e[3] = p1;
	e[4] = o1;

	for (int i = 0; i < 5; i++) {
	    for (int j = 0; j < 4; j++) {
		if (e[j].age > e[j + 1].age) {
		    Employee t = e[j];
		    e[j] = e[j + 1];
		    e[j + 1] = t;
		}
	    }
	}
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter lower limit of age");
	int lower = sc.nextInt();
	System.out.println("Enter upper limit of age");
	int upper = sc.nextInt();
	int highest = 0;
	int lowest = 0;
	for (int i = 0; i < 5; i++) {
	    if (e[i].sal > e[highest].sal) {
		highest = i;
	    }
	    if (e[i].sal < e[lowest].sal) {
		lowest = i;
	    }
	    if (e[i].age >= lower && e[i].age <= upper) {
		System.out.println(e[i]);
	    }
	}
	System.out.println("The employee with lowest salary is " + e[lowest]);
	System.out.println("The employee with highest salary is " + e[highest]);

    }

}