package com.mengzhou44;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {

	public static void main(String[] args) {
	     Map<Integer,Person> map= new HashMap<>();
		 map.put(1, new Person("John"));
		 map.put(2,new Person("Mary"));
		 map.put(3,new Person("Stebve"));

		System.out.println(map.size());
		System.out.println(map.entrySet());
		System.out.println(map.keySet());

		for(Integer key: map.keySet()) {
			System.out.println(map.get(key));
		}

		map.forEach((key,value)->System.out.println(key+"->"+value));
	}

	private record Person(String name) {}
}
