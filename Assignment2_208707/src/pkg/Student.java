package pkg;

public class Student {
	private String ID;
	private String name;
	private int mathMark;
	private int scienceMark;
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMathMark() {
		return mathMark;
	}
	
	public void setMathMark(int mathMark) {
		this.mathMark = mathMark;
	}
	
	public int getScienceMark() {
		return scienceMark;
	}
	public void setScienceMark(int scienceMark) {
		this.scienceMark = scienceMark;
	}
}
