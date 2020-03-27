package bg.swift.HW16_Ex0;

import java.util.Scanner;

public class Task0c_IsCorrectSQLInsert {

	public static void main(String[] args) {
		
//		CORRECT INPUT
//		insert into film_actor (film_id, actor_id, actor_name, film_date) values (34, 54, "Bruce Willis", '2000-10-10');
//		INSERT INTO film_actor (film_id, actor_id, actor_name, film_date) VALUES ("Bruce Willis", '2000-10-10');
		
//		NOT CORRECT INPUT
//		INSERT TO film_actor (film_id, actor_id, actor_name, film_date) VALUES (34, 54, "Bruce Willis", '2000-10-10');
//		INSERT INTO film_actor film_id, actor_id, actor_name, film_date) VALUES (34, 54, "Bruce Willis", '2000-10-10');
//		INSERT INTO film_actor (film_id, actor_id, actor_name, film_date) VALUES (34, 54, Bruce Willis", '2000-10-10');
//		INSERT INTO film_actor VALUES (34, 54, "Bruce Willis", '2000-10-10');
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the text here: ");
		String line = sc.nextLine();
		String pattern = "((INSERT INTO)\\s+\\w+\\s+[(]{1}[a-zA-Z_, ]+[)]{1}\\s+(VALUES)\\s+)[(]{1}\\s?(\"[a-zA-Z _0-9]+\",?|[ 0-9,.''-]+)+[)]{1}[;]{1}";
		System.out.println(isCorrectSQLInsert(pattern, line));
		sc.close();
	}

	public static String isCorrectSQLInsert(String pattern, String input) {
		if (input.toUpperCase().matches(pattern)) {
			return "The SQL QUERY is CORRECT.";
		}
		return "The SQL QUERY is NOT CORRECT.";
	}
}