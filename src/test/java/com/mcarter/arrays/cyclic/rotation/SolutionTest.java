package com.mcarter.arrays.cyclic.rotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Michael on 19/03/2017.
 */

@RunWith(Parameterized.class)
public class SolutionTest {

    @Parameterized.Parameters(name = "{index}: when array {0} is rotated {1} times then result is {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{ {new int[] { 1, 2, 3, 4 }, 1, new int[] { 4, 1, 2, 3 }},
                {new int[] { 3, 8, 9, 7, 6 }, 3, new int[] { 9, 7, 6, 3, 8 }} });
    }

    @Parameter()
    public int[] array;
    @Parameter(1)
    public int rotation;
    @Parameter(2)
    public int[] rotatedArray;

    @Test
    public void solution() throws Exception {
        assertThat(new com.mcarter.arrays.cyclic.rotation.Solution().solution(array, rotation), is(rotatedArray));
    }
}