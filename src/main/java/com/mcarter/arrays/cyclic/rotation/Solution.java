package com.mcarter.arrays.cyclic.rotation;

/**
 * Rotate an array n times
 */
public class Solution {
    public int[] solution(int[] A, int K) {
    //WRONG
        for(;K > 0;K--){
            int head = A[0];
            int tail = A[A.length-1];
            A[0] = tail;
            A[A.length-1] = head;
        }

        return A;
    }
}
