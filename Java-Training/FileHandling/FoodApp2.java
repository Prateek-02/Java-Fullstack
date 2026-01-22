package FileHandling;

import java.io.FileInputStream;

public class FoodApp2 {

	public static void main(String[] args) {
		String path = ("D:\\Java Training\\FileHandling\\F1\\food.txt");
		
		try(FileInputStream fis = new FileInputStream(path)){

			// Way 1
//			int content=fis.read();
//			while(content != -1) {
//				System.out.print((char)content);
//				content=fis.read();
//			}
			
			// Way 2
			byte b[] = new byte[fis.available()];
			fis.read(b);
			String content = new String(b);
			System.out.print(content);
					
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
