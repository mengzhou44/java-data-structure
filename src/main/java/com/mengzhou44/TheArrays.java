package com.mengzhou44;

import java.util.Arrays;
public class TheArrays {

	public static void main(String[] args) {
		 int[] nums = {100, 200};

		 for(int i=0; i< nums.length; i++) {
			 System.out.println(nums[i]);
		 }

		 for(int num : nums) {
			 System.out.println(num);
		 }

		 System.out.println(Arrays.toString(nums));

		 Arrays.stream(nums).forEach(System.out::println);

	}
}
