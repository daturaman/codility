/*
 * <copyright>
 *
 * Copyright (c) 2010-2017 Gresham Technologies plc. All rights reserved.
 *
 * </copyright>
 */
package com.mcarter.iterations;

/**
 * Return the largest binary gap - zeros surrounded by ones - in an integer.
 *
 * @author mcarter
 */
public class Solution {
	public int solution(int N){
		String binary = Integer.toBinaryString(N);
		int count = 0;
		int result = 0;
		boolean counting = false;
		for(int i = 0; i < binary.length(); i++){
			if(binary.charAt(i) == '1' && !counting){
                counting = true;
            }
            if(binary.charAt(i) == '1' && counting){
                if(count > result){
                    result = count;
                }
                count = 0;
            }
            if(binary.charAt(i)=='0' && counting){
			    count++;
            }
		}
		return result;
	}
}
