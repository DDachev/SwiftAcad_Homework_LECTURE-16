package bg.swift.HW16_Ex03;

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import org.junit.Test;

import bg.swift.HW16_Ex0.Task0b_FindFunnyCharacters;

public class Task0b_FindFunnyCharactersTest {

	@Test
	public void findFunnyCharactersTest_With_Numbers_And_Arithmetic_Signs() {
		String input = "5.5 + 6/12 - 5^6 + 3%2";
		String expected = "";
		assertEquals(expected, Task0b_FindFunnyCharacters
				.findFunnyCharacters(Pattern.compile("[^\\w\\d\\s\\,.~!@#$%^&*()_+-=/\\']"), input));
	}

	@Test
	public void findFunnyCharactersTest_With_æ() {
		String input = "Java edition 3.4 Java EæE 2";
		String expected = "The funny character is: æ _ On the position: 23 ";
		assertEquals(expected, Task0b_FindFunnyCharacters
				.findFunnyCharacters(Pattern.compile("[^\\w\\d\\s\\,.~!@#$%^&*()_+-=/\\']"), input));
	}

	@Test
	public void findFunnyCharactersTest_With_Many_Funny_Characters() {
		String input = "Java edition 3.4 Java EE 2 # $ !  æ, œ, ß, ð, ø, å, ł";
		String expected = "The funny character is: æ _ On the position: 34 "
				+ "The funny character is: œ _ On the position: 37 "
				+ "The funny character is: ß _ On the position: 40 "
				+ "The funny character is: ð _ On the position: 43 "
				+ "The funny character is: ø _ On the position: 46 "
				+ "The funny character is: å _ On the position: 49 "
				+ "The funny character is: ł _ On the position: 52 ";
		assertEquals(expected, Task0b_FindFunnyCharacters
				.findFunnyCharacters(Pattern.compile("[^\\w\\d\\s\\,.~!@#$%^&*()_+-=/\\']"), input));
	}

	@Test
	public void findFunnyCharactersTest_With_Empty_String() {
		assertEquals("", Task0b_FindFunnyCharacters
				.findFunnyCharacters(Pattern.compile("[^\\w\\d\\s\\,.~!@#$%^&*()_+-=/\\']"), ""));
	}
}
