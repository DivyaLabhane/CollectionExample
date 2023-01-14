package com.velocity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> s= new HashSet<>();
		s.add(12);
		s.add(11);
		s.add(19);
		s.add(30);
		
		System.out.println(s);
	}

}
