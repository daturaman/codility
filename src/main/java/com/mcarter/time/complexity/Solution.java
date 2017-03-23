/*
 * <copyright>
 *
 * Copyright (c) 2010-2017 Gresham Technologies plc. All rights reserved.
 *
 * </copyright>
 */
package com.mcarter.time.complexity;

/**
 * @author mcarter
 */
public class Solution {
	public int solution(int X, int Y, int D){
		return (int) Math.ceil((double)(Y-X)/D);
	}
}
