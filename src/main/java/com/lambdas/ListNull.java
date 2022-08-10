package com.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListNull {

	public static void main(String[] args) {
		List<Integer> testList = Arrays.asList(123, 456, 789, 224, null);
				testList.stream().filter(Objects::nonNull).map(num -> {
			String output = "";
			if(num % 2 == 0) {
				output = num+"e,";
			}else {
				output = "o"+num+",";
			}
			return output;
		}).forEach(System.out::print);
	}

}
