package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader fileReader = null;
		String line;
		
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			System.out.println("Closing file reader.");
			fileReader.close();
		}
		
//		Donut need the following when "throws" is in the declaration.
//		catch (FileNotFoundException e) {
//			System.out.println("Exception caught! File not found.");
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("Exception caught! I/O exception.");
//			e.printStackTrace();
//		}
	}

}