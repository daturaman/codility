package com.mcarter.arrays.odd.occurrences;

import java.util.Arrays;

/**
 * Find value that occurs in odd number of elements.
 *
 * @author mcarter
 */
public class Solution {
	public int solution(int[] A){
		int result = 0;
        Arrays.sort(A);

        for(int i = 0; i < A.length; i+=2){
            if(i == A.length-1){
                result = A[i];
                break;
            }
            if(A[i] != A[i+1]){
                result = A[i];
                break;
            }
        }
        return result;
	}
}
