package com.evergent.Corejava.Strings;

import java.util.Arrays;

public class StringPerfomance6 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			char ch = (char)('a' + i);
			builder.append(ch);
		}
		System.out.println(builder);
	}

}
