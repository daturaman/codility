package com.mcarter.counting.elements.missing.integer;

/**
 * Created by Michael on 02/04/2017.
 */
public class Solution {
    public int solution(int[] A) {
        int [] count = new int[A.length + 1];
        for (int val : A) {
            if (val > count.length - 1) {
                int[] bigger = new int[val + 1];
                System.arraycopy(count, 0, bigger, 0, count.length);
                count = bigger;
            }
            if(val > 0){
                count[val]++;
            }
        }
        int min = 1;
        boolean oneFound = false;
        for (int i = 1; i < count.length; i++) {
            if(!oneFound && count[i] == 0){
                continue;
            }
            if(!oneFound && count[i] == 1){
                oneFound = true;
                continue;
            }
            if(count[i] == 0 && oneFound){
                min = i;
                break;
            }
        }

        return min;
    }
}
