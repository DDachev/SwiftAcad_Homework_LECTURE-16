package bg.swift.HW16_Ex03;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import bg.swift.HW16_Ex01.Task1_FilterFiles;

public class Task1_FilterFilesTest {

	@Test
	public void filterFilesTest_With_Empty_Input() {
		List<String> input = new ArrayList<>();
		assertEquals(0, Task1_FilterFiles.filterFiles(input).count());
	}

	@Test
	public void filterFilesTest_With_Files_Which_Are_Not_Graphic() {
		List<String> input = new ArrayList<>();
		input.add("workspace.doc");
		input.add("documentation.html");
		assertEquals(0, Task1_FilterFiles.filterFiles(input).count());
	}

	@Test
	public void filterFilesTest_With_Graphi_Files() {
		List<String> input = new ArrayList<>();
		input.add("workspace.doc");
		input.add("updated_img0912.png");
		input.add("favicon.gif");
		assertEquals(2, Task1_FilterFiles.filterFiles(input).count());
	}
}
