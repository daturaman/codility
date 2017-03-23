/*
 * <copyright>
 *
 * Copyright (c) 2010-2017 Gresham Technologies plc. All rights reserved.
 *
 * </copyright>
 */
package com.mcarter.time.complexity.permmissingelem;

/**
 * @author mcarter
 */
public class Solution {

	public int solution(int[] A) {
		int n = A.length + 1;
		int expected = n * (n + 1) / 2;
		int result = 0;
		for (int i : A) {
			result += i;
		}
		return expected - result;
	}
}
