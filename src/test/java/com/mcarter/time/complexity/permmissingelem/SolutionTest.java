package com.mcarter.time.complexity.permmissingelem;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class SolutionTest {

	@Parameters(name = "{index}: when array contains {0} then missing integer is {1}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][]{{new int[]{1,2,3,5}, 4}, {new int[]{1,2,3,4,6}, 5}, {new int[]{2,3,4}, 1}});
	}

	@Parameter()
	public int[] fInput;
	@Parameter(1)
	public int fExpected;

	@Test
	public void solution() throws Exception {
		assertThat(new Solution().solution(fInput), is(fExpected));
	}
}