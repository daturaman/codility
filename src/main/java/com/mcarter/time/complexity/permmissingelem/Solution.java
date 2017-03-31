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
		int expected = (A.length + 1) * ((A.length + 1) + 1) / 2;
		for (int i : A) {
			expected -= i;
		}
		return expected;
	}
}
