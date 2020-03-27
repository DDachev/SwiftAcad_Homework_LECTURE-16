package bg.swift.HW16_Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task1_FilterFiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the number of lines: ");
		int numberOfLines = sc.nextInt();
		System.out.println("Insert the lines: ");

		List<String> lines = new ArrayList<>();
		sc.nextLine();

		for (int i = 0; i < numberOfLines; i++) {
			lines.add(sc.nextLine());
		}

		Stream<String> files = filterFiles(lines);
		files.forEach(System.out::println);

		sc.close();
	}

	public static Stream<String> filterFiles(List<String> input) {
		Stream<String> stream = input.stream()
				.filter(s -> s.endsWith(".jpg") || s.endsWith(".png") || s.endsWith(".bmp") || s.endsWith(".gif"))
				.map(s -> s.replace(".", " "));
		return stream;
	}
}
