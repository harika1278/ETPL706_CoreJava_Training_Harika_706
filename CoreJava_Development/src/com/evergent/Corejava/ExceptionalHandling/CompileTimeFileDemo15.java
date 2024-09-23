package com.evergent.Corejava.ExceptionalHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CompileTimeFileDemo15 {
	
	public static void main(String[] args) {
		try {
			// Attempt to open a file that doesn't exist
			File file = new File("C:/mydata/myinfotxt");
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found : "+e.getMessage());
			e.printStackTrace();
		}

	}

}
