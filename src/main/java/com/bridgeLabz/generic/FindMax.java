package com.bridgeLabz.generic;

import java.util.Arrays;

public class FindMax<X, Y, Z> {
	X[] xArr;
	Y[] yArr;
	Z[] zArr;
	
	public FindMax() {}
	public FindMax(X[] xArr, Y[] yArr, Z[] zArr) {

		this.xArr = xArr;
		this.yArr = yArr;
		this.zArr = zArr;
	}

	public <T extends Comparable<T>> T Max(T... optionalValues) {
		Arrays.sort(optionalValues);
		T max = optionalValues[optionalValues.length-1];
		return max;

	}

}
