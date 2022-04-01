package pkg;

import java.util.Scanner;

public class MVC_Model_main {

    public static void main(String[] args) {
    	
		Scanner input = new Scanner(System.in);
		
		MVC_View view = new MVC_View();
		
		System.out.print("1. Insert new student data\n2. Get current student data\n\nEnter a number: ");
				
		view.main(input.nextInt());
		
		input.close();
	}
}
