package com.velocity;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
	}

}
