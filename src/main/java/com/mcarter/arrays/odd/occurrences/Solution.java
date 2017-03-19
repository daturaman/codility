package com.mcarter.arrays.odd.occurrences;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Find value that occurs in odd number of elements.
 *
 * @author mcarter
 */
public class Solution {
	public int solution(int[] A){
		int result = 0;
		List<Integer> integers = IntStream.of(A).boxed().collect(Collectors.toList());

        for(int a : A){
            if(integers.size() == 1){
                result = integers.get(0);
                break;
            }
            if(integers.contains(a)){
                integers.remove(Integer.valueOf(a));
            }
            if(integers.contains(a)){
                integers.remove(Integer.valueOf(a));
            }else{
                result = a;
                break;
            }
        }
        return result;
	}
}
