package com.mengzhou44;

import java.util.Stack;

public class WorkingWithStack {
	public static void main(String[] args) {
		 Stack<String> colors = new Stack<>();

		 colors.push("red");
		 colors.push("blue");
         colors.push("green");

		 System.out.println(colors.peek());

		System.out.println(colors.pop());

		System.out.println(colors.size());

	}
}
