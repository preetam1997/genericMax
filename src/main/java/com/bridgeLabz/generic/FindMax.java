package com.bridgeLabz.generic;

public class FindMax {

	public Integer Max(Integer[] arr) {
		int max = arr[0];
		if (arr[1].compareTo(max) > 0) {
			max = arr[1];
		}
		if (arr[2].compareTo(max) > 0) {
			max = arr[2];
		}

		return max;

	}

	public Float Max(Float[] arr) {
		float max = arr[0];
		if (arr[1].compareTo(max) > 0) {
			max = arr[1];
		}
		if (arr[2].compareTo(max) > 0) {
			max = arr[2];
		}

		return max;

	}
	
	public String Max(String[] arr) {
		String max = arr[0];
		if (arr[1].compareTo(max) > 0) {
			max = arr[1];
		}
		if (arr[2].compareTo(max) > 0) {
			max = arr[2];
		}

		return max;

	}

}
