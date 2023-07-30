package com.HackerRank.Java.Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSorting {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		for(int i = 1; i <= count; i++) {
			studentList.add(new Student(scan.nextInt(), scan.next(), scan.nextFloat()));
		}
		scan.close();
		
		studentList.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student a, Student b) {
				if(a.getCgpa() != b.getCgpa()) {
					if(a.getCgpa() < b.getCgpa()) {
						return 1;
					} else if (a.getCgpa() > b.getCgpa()) {
						return -1;
					} else {
						return 0;
					}
				} else if(!a.getName().equals(b.getName())) {
					return a.getName().compareTo(b.getName());
				} else {
					if(a.getId() < b.getId()) {
						return 1;
					} else if(a.getId() > b.getId()) {
						return -1;
					} else {
						return 0;
					}
				}
				
			}
			
		}).forEach(x -> {
			System.out.println(x.getName());
		});
		/*System.out.println("Done");
		finalList.forEach(x -> System.out.println(x.getName());*/
	}
}
class Student{
	private int id;
	private String name;
	private float cgpa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public Student(int id, String name, float cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
	
}
