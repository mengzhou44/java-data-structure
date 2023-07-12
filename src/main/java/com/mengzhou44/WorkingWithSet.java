package com.mengzhou44;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSet {

	public static void main(String[] args) {
		Set<Ball> balls = new HashSet<>();

		balls.add(new Ball("red"));
		balls.add(new Ball("red"));

		System.out.println(balls.size());

		balls.forEach(System.out::println);
	}

	private record Ball(String color) {}

}
