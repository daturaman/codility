package com.mcarter.hackerrank.beautiful.word;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SolutionTest {

	@Parameterized.Parameters(name = "{index}: when word is {0} then result is {1}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { "batman", "YES" }, { "book", "NO" }, { "ceiling", "NO" },
				{ "aardvark", "NO" }, { "apple", "NO" }, {"palindrome", "YES"} });
	}

	@Parameterized.Parameter() public String fInput;
	@Parameterized.Parameter(1) public String fExpected;

	@Test
	public void solution() throws Exception {
		assertThat(new Solution().solution(fInput), is(fExpected));
	}
}