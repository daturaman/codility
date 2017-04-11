/*
 * <copyright>
 *
 * Copyright (c) 2010-2017 Gresham Technologies plc. All rights reserved.
 *
 * </copyright>
 */
package com.mcarter;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mcarter
 */
public class Practice {
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int height[] = new int[n];
		for(int height_i=0; height_i < n; height_i++){
			height[in.nextInt()]++;
		}
		Arrays.sort(height);
		System.out.println(height[height.length-1]);
	}
}
