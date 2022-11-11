package arrayproblems;

import java.io.File;
import java.util.Arrays;

public class Student {
	
	
	public static void main(String[] args) {
		
	
		/*
		 * Student satish= new Student(); satish.name="Satish Chand"; satish.rollNo=723;
		 */
		
		File file= new File("C:\\Java Trainings");

		System.out.println(Arrays.asList(file.list()));
		
	}
}
