package pkg;

import java.sql.*;
import java.util.*;

public class MVC_View {
	
	public void main(int i) {
		Student student = new Student();
		
		MVC_Controller controller = new MVC_Controller(student, this);
		Scanner input = new Scanner(System.in);
		
		switch(i) {
		
		case 1:
			try {
				
				System.out.print("\nEnter Student ID: ");
				String ID = input.next();
				
				System.out.print("Enter Student Name: ");
				String name = input.next();
				
				System.out.print("Enter Math Mark: ");
				int mathMark = input.nextInt();
				
				System.out.print("Enter Science Mark: ");
				int scienceMark = input.nextInt();
				
				controller.insertStudent(ID, name, mathMark, scienceMark);
							
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
			
			input.close();
			
			break;
		case 2:
				System.out.print("\nStudent ID? " );
				String ID = input.next();
				
				try {
					System.out.println();
					controller.getStudent(ID);
				}catch (SQLException ex) {
					ex.printStackTrace();
				}
				
				input.close();

		break;	
		  default:
			   System.out.print("\nWrong input! enter a number in range 1-2\n\n");
			   MVC_Model_main.main(null);
		}
	}
	
	public void printStudent(String ID, String name, int mathMark, int scienceMark) {
		System.out.println("Student ID: " + ID);
		System.out.println("Student Name: " + name);
		System.out.println("Math Mark: " + mathMark);
		System.out.println("Science Math: " + scienceMark);
	}

}
