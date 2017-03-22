package com.mcarter.time.complexity;

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

	@Parameters(name = "{index}: when start is {0} and finish is {1} and leap distance is {2} then minimum required jumps is {3}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 10, 85, 30, 3 } });
	}

	@Parameter() public int start;
	@Parameter(1) public int finish;
	@Parameter(2) public int leapDistance;
	@Parameter(3) public int minJumps;

	@Test
	public void solution() throws Exception {
		assertThat(new Solution().solution(start, finish, leapDistance), is(minJumps));
	}
}