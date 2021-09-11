package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101, "Spencer", 23);
		al.add(s1);
		Student s2 = new Student(102, "Hamn", 21);
		al.add(s2);
		al.add(new Student(104, "Oskar", 25));
		al.add(new Student(105, "Alessio", 24));
		al.add(new Student(106, "Mathew", 31));
		al.add(new Student(107, "Seo", 20));
		al.add(new Student(108, "Laura", 27));
		al.add(new Student(109, "James", 28));
		al.add(new Student(110, "David", 29));
		al.add(new Student(111, "Gianluca", 226));
		
		Collections.sort(al);
		
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
