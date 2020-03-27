package bg.swift.HW16_Ex0;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0b_FindFunnyCharacters {

	public static void main(String[] args) {

//		Java edition 3.4 Java EE 2 # $ !  æ, œ, ß, ð, ø, å, ł
//		5.5 + 6 = 12/2 8%3

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the text here: ");
		String line = sc.nextLine();
		String pattern = "[^\\w\\d\\s\\,.~!@#$%^&*()_+-=/\\']";
		System.out.println(findFunnyCharacters(Pattern.compile(pattern), line));

		sc.close();
	}

	public static String findFunnyCharacters(Pattern p, String input) {
		Matcher m = p.matcher(input);
		StringBuilder str = new StringBuilder();
		while (m.find()) {
			str.append("The funny character is: " + m.group() + " _ On the position: " + m.start() + " ");
		}
		return str.toString();
	}
}
