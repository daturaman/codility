package com.mcarter.counting.elements.missing.integer;

import com.mcarter.iterations.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Michael on 02/04/2017.
 */
@RunWith(Parameterized.class)
public class SolutionTest {

    @Parameterized.Parameters(name = "{index}: when integer is {0} then min positive integer is {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { {new int[]{1 , 3, 6, 4, 1, 2}, 5}, {new int[]{97, 98, 100}, 99}, {new int[]{3}, 2}});
    }

    @Parameterized.Parameter() public int [] fInput;
    @Parameterized.Parameter(1) public int fExpected;

    @Test
    public void solution() throws Exception {
        assertThat(new Solution().solution(fInput), is(fExpected));
    }
}