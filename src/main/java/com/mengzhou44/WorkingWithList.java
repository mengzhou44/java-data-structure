package com.mengzhou44;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
public class WorkingWithList {
	 public static void main(String[] args) {
		  List<String> colors = new ArrayList<>();
		  colors.add("red");
		  colors.add("blue");

		 System.out.println(colors.size());
		 System.out.println(colors.contains("red"));

		 for(int i=0; i<colors.size(); i++) {
			 System.out.println(colors.get(i));
		 }


		  for(String color : colors) {
			  System.out.println(color);
		  }

		  colors.forEach(System.out::println);

		 List<Integer>  nums  =List.of(1,2,3);
//		 nums.add(4);
		 nums.forEach(System.out::println);

	 }
}
