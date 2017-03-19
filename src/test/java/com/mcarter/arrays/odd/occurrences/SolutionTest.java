package com.mcarter.arrays.odd.occurrences;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SolutionTest {

    @Parameters(name = "{index}: when array contains {0} then odd integer is {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{{new int[]{9, 3, 9, 3, 9, 7, 9}, 7}, {new int[]{1, 2, 1}, 2}, {new int[]{1, 0, 0, 0, 0}, 1}, {new int[]{7, 0, 7, 0, 5}, 5}});
    }

    @Parameter()
    public int[] fInput;
    @Parameter(1)
    public int fExpected;

    @Test
    public void solution() throws Exception {
        assertThat(new com.mcarter.arrays.odd.occurrences.Solution().solution(fInput), is(fExpected));
    }
}