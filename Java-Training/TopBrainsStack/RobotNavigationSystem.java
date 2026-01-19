package TopBrainsStack;

import java.util.Scanner;
import java.util.Stack;

public class RobotNavigationSystem {
	static Stack<String> backStack = new Stack<>();
	static Stack<String> forwardStack = new Stack<>();
	static int position=0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		boolean flag = true;
		do {
			System.out.println("1. Move Forward");
			System.out.println("2. Move Backward");
			System.out.println("3. Undo Last Move");
			System.out.println("4. Redo Last Undone Move");
			System.out.println("5. Show Current Position");
			System.out.println("6. Exit Program");
			
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					moveForward();
					break;
				case 2:
					moveBackward();
					break;
				case 3:
					undoMove();
					break;
				case 4:
					redoMove();
					break;
				case 5:
					System.out.println("Current Position: "+position);
					break;
				case 6:
					System.out.println("Exiting Program...");
					flag = false;
					break;
					
			}
		}
		while(!flag);
	}
	
	private static void moveForward() {
		System.out.print("Enter forward steps: ");
		String steps = sc.nextLine();
		
		backStack.push(steps);
		forwardStack.clear();
		position += Integer.valueOf(steps);
	}
	
	private static void moveBackward() {
		System.out.println("Enter backward steps: ");
		String steps = sc.nextLine();
		
		backStack.push(steps);
		forwardStack.clear();
		position -= Integer.valueOf(steps);
	}
	
	private static void undoMove() {
		backStack.pop();
		
	}
	
	private static void redoMove() {
		
	}
}
