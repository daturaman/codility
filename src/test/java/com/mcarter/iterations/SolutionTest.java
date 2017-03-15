package com.mcarter.iterations;

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

	@Parameters(name = "{index}: when integer is {0} then max binary gap is {1}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1041, 5 }, {529, 4}, {9, 2}, {66561, 9} });
	}

	@Parameter(0) public int fInput;
	@Parameter(1) public int fExpected;

	@Test
	public void solution() throws Exception {
		assertThat(new Solution().solution(fInput), is(fExpected));
	}
}