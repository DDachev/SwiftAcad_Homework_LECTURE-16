package bg.swift.HW16_Ex0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0a_FindIntegers {

	public static void main(String[] args) {
		String line = "Java 12,  Pi = 3.14, Current year 2020, The temperature is -5 gradus Celsius.";
		String pattern = "(?<![.\\d])-?\\d+(?![.\\d])";
		System.out.println(findIntegers(Pattern.compile(pattern), line));
	}

	public static String findIntegers(Pattern p, String input) {
		Matcher m = p.matcher(input);
		StringBuilder str = new StringBuilder();
		while (m.find()) {
			str.append("The number(integer) is: " + m.group() + " _ On the position: " + m.start() + "; ");
		}
		return str.toString();
	}
}