/*
 * <copyright>
 *
 * Copyright (c) 2010-2017 Gresham Technologies plc. All rights reserved.
 *
 * </copyright>
 */
package com.mcarter.time.complexity.tape.equilibrium;

/**
 * @author mcarter
 */
public class Solution {

	public int solution(int[] A) {
		int total = 0;
		for (int i : A) {
			total += i;
		}

		int leftTotal = A[0];
		int result = Math.abs((total - leftTotal) - leftTotal);
		for (int i = 1; i < A.length; i++) {
			int diff = Math.abs((total - leftTotal) - leftTotal);
			if (diff < result) {
				result = diff;
			}
			leftTotal += A[i];
		}
		return result;
	}
}
