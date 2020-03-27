package bg.swift.HW16_Ex03;

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import org.junit.Test;

import bg.swift.HW16_Ex0.Task0a_FindIntegers;

public class Task0a_FindIntegersTest {

	@Test
	public void findIntegersTest_With_Many_Integers_In_Text() {
		String input = "Java 12,  Pi = 3.14, Current year 2020, The temperature is -5 gradus Celsius.";
		String expected = "The number(integer) is: 12 _ On the position: 5; "
				+ "The number(integer) is: 2020 _ On the position: 34; The number(integer) is: -5 _ On the position: 59; ";
		assertEquals(expected, Task0a_FindIntegers.findIntegers(Pattern.compile("(?<![.\\d])-?\\d+(?![.\\d])"), input));
	}

	@Test
	public void findIntegersTest_With_Float_Numbers_Only() {
		String input = "x = 3.14 + 7.22 - 8.6";
		assertEquals("", Task0a_FindIntegers.findIntegers(Pattern.compile("(?<![.\\d])-?\\d+(?![.\\d])"), input));
	}

	@Test
	public void findIntegersTest_With_Empty_String() {
		assertEquals("", Task0a_FindIntegers.findIntegers(Pattern.compile("(?<![.\\d])-?\\d+(?![.\\d])"), ""));
	}
}
