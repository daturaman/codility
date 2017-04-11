/*
 * <copyright>
 *
 * Copyright (c) 2010-2017 Gresham Technologies plc. All rights reserved.
 *
 * </copyright>
 */
package com.mcarter.hackerrank.beautiful.word;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mcarter
 */
public class Solution {

	public String solution(String input) {
		String result = "YES";
		Matcher matcher = Pattern.compile("([a-z])\\1|[a,e,i,o,u,y]{2}").matcher(input);
		if (matcher.find()) {
			result = "NO";
		}
		return result;
	}
}
