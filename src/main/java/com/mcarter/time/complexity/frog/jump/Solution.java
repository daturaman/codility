package com.mcarter.time.complexity.frog.jump;

/**
 * @author mcarter
 */
public class Solution {
	public int solution(int X, int Y, int D){
		//O(1) time complexity (constant)
		return (int) Math.ceil((double)(Y-X)/D);
	}
}
