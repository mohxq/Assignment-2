package pkg;

import java.sql.*; 

public class MVC_Controller {
	
	private MVC_View view;
	
	public MVC_Controller(Student model, MVC_View view){
		this.view = view;
	}
	
	public void insertStudent(String id, String name,  int mathMark, int scienceMark) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?useSSL=false&serverTimezone=UTC", "root", "psw123");
		Statement statement = con.createStatement();
		
		statement.executeUpdate("insert into student values ('" + id + "', '"+ name + "', " + mathMark + ", " + scienceMark + ")");
		
	try {
		System.out.println();
		getStudent(id);
		System.out.println("\nInserted Successfully");
	} catch (SQLException ex) {
		ex.printStackTrace();
	}
	}

	public void getStudent(String id) throws SQLException{       
		Student s = new Student();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?useSSL=false&serverTimezone=UTC", "root", "psw123");
		Statement ss = con.createStatement();
		ResultSet rs = ss.executeQuery ("select * from student where id = '" + id + "'"); 
		
		if (rs.next()) {
				s.setID(rs.getString("id"));
				s.setName(rs.getString("name"));
				s.setMathMark(rs.getInt("math_mark"));
				s.setScienceMark(rs.getInt("science_mark"));
		    } 
		
		view.printStudent(s.getID(), s.getName(), s.getMathMark(), s.getScienceMark());
		
		if (s.getID() == null) {
			System.out.println("\nStudent ID not found!");
		}
		
	}
}
