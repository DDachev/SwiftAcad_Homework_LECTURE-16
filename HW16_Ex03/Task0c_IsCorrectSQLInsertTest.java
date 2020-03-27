package bg.swift.HW16_Ex03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bg.swift.HW16_Ex0.Task0c_IsCorrectSQLInsert;

public class Task0c_IsCorrectSQLInsertTest {

	@Test
	public void IsCorrectSQLInsertTest_Without_Values() {
		String input = "INSERT INTO film_actor (film_id, actor_id, actor_name, film_date);";
		String expected = "The SQL QUERY is NOT CORRECT.";
		String pattern = "((INSERT INTO)\\s+\\w+\\s+[(]{1}[a-zA-Z_, ]+[)]{1}"
				+ "\\s+(VALUES)\\s+)[(]{1}\\s?(\"[a-zA-Z _0-9]+\",?|[ 0-9,.''-]+)+[)]{1}[;]{1}";
		assertEquals(expected, Task0c_IsCorrectSQLInsert.isCorrectSQLInsert(pattern, input));
	}
	
	@Test
	public void isCorrectSQLInsertTest_With_Upper_Case() {
		String input = "INSERT INTO film_actor (film_id, actor_id, actor_name, film_date) VALUES (\"Bruce Willis\", '2000-10-10');";
		String expected = "The SQL QUERY is CORRECT.";
		String pattern = "((INSERT INTO)\\s+\\w+\\s+[(]{1}[a-zA-Z_, ]+[)]{1}"
				+ "\\s+(VALUES)\\s+)[(]{1}\\s?(\"[a-zA-Z _0-9]+\",?|[ 0-9,.''-]+)+[)]{1}[;]{1}";
		assertEquals(expected, Task0c_IsCorrectSQLInsert.isCorrectSQLInsert(pattern, input));
	}
	
	@Test
	public void isCorrectSQLInsertTest_With_Lower_Case() {
		String input = "insert into film_actor (film_id, actor_id, actor_name, film_date) values (34, 54, \"Bruce Willis\", '2000-10-10');";
		String expected = "The SQL QUERY is CORRECT.";
		String pattern = "((INSERT INTO)\\s+\\w+\\s+[(]{1}[a-zA-Z_, ]+[)]{1}"
				+ "\\s+(VALUES)\\s+)[(]{1}\\s?(\"[a-zA-Z _0-9]+\",?|[ 0-9,.''-]+)+[)]{1}[;]{1}";
		assertEquals(expected, Task0c_IsCorrectSQLInsert.isCorrectSQLInsert(pattern, input));
	}
	
	@Test
	public void isCorrectSQLInsertTest_With_Empty_String() {
		String input = "";
		String expected = "The SQL QUERY is NOT CORRECT.";
		String pattern = "((INSERT INTO)\\s+\\w+\\s+[(]{1}[a-zA-Z_, ]+[)]{1}"
				+ "\\s+(VALUES)\\s+)[(]{1}\\s?(\"[a-zA-Z _0-9]+\",?|[ 0-9,.''-]+)+[)]{1}[;]{1}";
		assertEquals(expected, Task0c_IsCorrectSQLInsert.isCorrectSQLInsert(pattern, input));
	}

}
