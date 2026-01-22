package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling1 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Java Training\\FileHandling\\F1\\F2");

		if (f.exists()) {
			System.out.println("Folder already exists");
		} else {
			f.mkdirs();
			System.out.println("Created : " + f);
		}
		
		File f1 = new File("D:\\Java Training\\FileHandling\\F1\\F2\\File.txt");
		if (f1.exists()) {
			System.out.println("File Already Exist");
		} else {
			f1.createNewFile();
			System.out.println("File created "+f1);
		}

		File f2 = new File("D:\\Java Training\\FileHandling\\F1\\F2\\Prateek.txt");
		
		f1.renameTo(f2);
		System.out.println("File " + f1 + " renamed to "+ f2);
		
		
		
	}

}
