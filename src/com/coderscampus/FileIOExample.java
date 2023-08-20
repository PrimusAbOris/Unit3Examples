package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) {
		
		BufferedReader fileReader = null;
		
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			System.out.println(fileReader.toString());
			fileReader.close(); // this will never run, as any exception in the previous line makes it go to catch
		} catch (FileNotFoundException e) {
			System.out.println("Exception caught! File not found.");
			e.printStackTrace();
		} catch (IOException e) { // red line -> add catch clause (it gives a TODO comment by default too)
			// TODO Auto-generated catch block
			// This will never run either, as line 17 is the place this might be thrown!
			System.out.println("Exception caught! I/O exception.");
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing file reader.");
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
