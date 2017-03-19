package com.mcarter.arrays.cyclic.rotation;

/**
 * Rotate an array n times
 */
public class Solution {
    public int[] solution(int[] A, int K) {
        for(;K > 0;K--){
            for(int i = 0; i < A.length; i++){
                int head = A[i];
                int tail = A[A.length-1];
                A[i] = tail;
                A[A.length-1] = head;
            }
        }
        return A;
    }
}
