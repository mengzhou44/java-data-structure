package com.mengzhou44;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {

	public static void main(String[] args) {
	    Queue<Person> line = new LinkedList<>();
		line.offer(new Person("John", 20));
		line.offer(new Person("Mary", 21));

		System.out.println(line.peek());
		System.out.println(line.poll());
		System.out.println(line.size());
	}

	private record Person(String name, int age) {}
}
