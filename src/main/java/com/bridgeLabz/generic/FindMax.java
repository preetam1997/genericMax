package com.bridgeLabz.generic;

public class FindMax<X , Y , Z > {
	X[] xArr;
	Y[] yArr;
	Z[] zArr;
	
	public FindMax(X[] xArr, Y[] yArr, Z[] zArr) {
		
		this.xArr = xArr;
		this.yArr = yArr;
		this.zArr = zArr;
	}

	public <T extends Comparable<T>> T Max(T[] arr) {
		T max = arr[0];
		if (arr[1].compareTo(max) > 0) {
			max = arr[1];
		}
		if (arr[2].compareTo(max) > 0) {
			max = arr[2];
		}

		return max;

	}

	public static void main(String[] args) {
		Integer[] xArr = { 3, 2, 1 };
		Float[] yArr = { 3.1f, 2.9f, 1.0f };
		String[] zArr = { "peach", "apple", "banana" };
		
		FindMax findMax = new FindMax<Integer,Float,String>(xArr,yArr,zArr);
		Comparable m = 3;
		System.out.println(findMax.Max(xArr)==m);
	}
}
