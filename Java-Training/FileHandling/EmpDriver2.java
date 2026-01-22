package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class EmpDriver2 {

	public static void main(String[] args) {
		String path = "D:\\Java Training\\FileHandling\\F1\\EmployeeDetails.txt";
		int file;
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			file = br.read();
			
			while(file != -1) {
				System.out.print((char)file);
				file = br.read();
			}
			br.close();
		}
		catch(Exception e) {
			System.err.println("Invalid Process, Cannot read file : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
