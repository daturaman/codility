package com.mcarter.time.complexity.tape.equilibrium;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SolutionTest {

	@Parameterized.Parameters(name = "{index}: when array contains {0} then minimal difference is {1}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { new int[] { 3, 1, 2, 4, 3 }, 1 }, { new int[] { -1000, 1000 }, 2000 }, {new int[]{1,2,3,-6,-10,-8}, 2} });
	}

	@Parameterized.Parameter() public int[] fInput;
	@Parameterized.Parameter(1) public int fExpected;

	@Test
	public void solution() throws Exception {
		assertThat(new Solution().solution(fInput), is(fExpected));
	}
}