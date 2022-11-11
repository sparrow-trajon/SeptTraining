package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class FileHandler {

	public static void main(String[] args) throws Exception {
		// how to take input from user
		// args

		// print all args
		/*
		 * int len=args.length;
		 * 
		 * System.out.println("Printing All arguments "); for(int i=0;i<len;i++) {
		 * System.out.println(args[i]);
		 * 
		 * }
		 */

		// how to take input from user

		/*
		 * System.out.println("Enter your name :-"); Scanner sc= new Scanner(System.in);
		 * String name= sc.nextLine(); sc.nextLine();
		 * System.out.println("Enter your mobileNo:-"); int mobileNumber= sc.nextInt();
		 * 
		 * sc.nextLine(); sc.nextLine(); System.out.println("Enter your profession");
		 * String professio=sc.nextLine();
		 * 
		 * 
		 * System.out.println(name); System.out.println(mobileNumber);
		 * System.out.println(professio);
		 * 
		 */

		/**
		 * We are just creating the file object
		 * 
		 */
		/*
		 * File x=new File("../SeptBatchTraining/src/main/java/sept");
		 */
		// x.createNewFile(); //create the new file
//		x.delete();

		/*
		 * x.mkdir();
		 * 
		 * System.out.println(x.exists()); System.out.println(x.canRead());
		 * System.out.println(x.canWrite()); System.out.println(x.isDirectory());
		 * System.out.println(x.isFile());
		 * //System.out.println(Arrays.asList(x.listFiles()).toString());
		 * 
		 * //FileInputStream xx= new FileInputStream(x);
		 * 
		 * 
		 * 
		 */

		// WAP to create a file at destination d with fileName f;

		/*
		 * String path = "../SeptBatchTraining/src/main/java/"; String fileName =
		 * "class01.txt";
		 * 
		 * boolean isFileCreated = createFile(path, fileName);
		 * System.out.println("File " + fileName + " is created :-" + isFileCreated);
		 * 
		 * //S readTextFile(path, fileName); int totalCharacters =
		 * countFileCharacters(path, fileName);
		 * 
		 * System.out.println(totalCharacters); readWithFileReader(path,fileName);
		 */
		String content="This is Shami, a java learner and a student.";
		String filePath="../SeptBatchTraining/src/main/java/class01.txt";
		writeFile(content, filePath);
		System.out.println("Operation is done");
	}
	
	public static void writeFile(String content,String filePath) throws Exception {
			
		File file= new File(filePath);
		FileWriter fileWriter= new FileWriter(file, true);
		BufferedWriter writer= new BufferedWriter(fileWriter);
		//writer.write(content);
		writer.append(content);
		writer.newLine();
		writer.append("Here I am");
		writer.flush();
		writer.close();
		
		
	}
	private static void readWithFileReader(String path, String fileName) throws Exception {
		String filePath = getFilePath(path, fileName);
		File f = new File(filePath);
		int count = 0;
		if (f.exists()) {
			FileReader fileReader = new FileReader(f);
			int c = fileReader.read();
			while (c != -1) {
				System.out.println(c);
				c = fileReader.read();
				count += 1;
			}
		} else {
			System.out.println("File is not present");
		}

		System.out.println("Total " + count + " characters present in the file.");
	}

	/**
	 * Method will take two parameters as input i.e file name and path. It will
	 * return total characters present in the file. if file is empty method will
	 * return 0.
	 * 
	 * It will throw Exception if file is not found or not readable.
	 * 
	 * @param path
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public static int countFileCharacters(String path, String fileName) throws Exception {
		String filePath = getFilePath(path, fileName);
		File file = new File(filePath);
		int totalCharacters = 0;
		if (file.exists()) {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while (null != line) {
				totalCharacters += line.length();
				line = bufferedReader.readLine();
			}
		} else {
			System.out.println("file does'nt exists");
		}
		return totalCharacters;

	}

	public static String getFilePath(String path, String fileName) {
		return path + "/" + fileName;
	}

	public static void readTextFile(String path, String fileName) throws Exception {

		String filePath = path + "/" + fileName;
		File file = new File(filePath);
		if (file.exists()) {
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			int count = 1;
			while (null != line) {
				System.out.println("Line No:- " + count + " " + line);
				line = br.readLine();
				count += 1;
			}
			br.close();
		} else {
			System.out.println("File is not present in the requested diectory, Kindly check the file path again.");
		}

	}

	public static boolean createFile(String path, String fileName) throws IOException {

		String pathName = path + "/" + fileName;
		File f = new File(pathName);

		if (!f.exists()) {
			f.createNewFile();
			System.out.println("New file is created at requested path");
			return Boolean.TRUE;
		} else {
			System.out.println("File is already present in the directory.");
			return Boolean.FALSE;
		}

	}

}
