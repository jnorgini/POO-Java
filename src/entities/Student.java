package entities;

public class Student {
	
	private String name;
	private Double grade1;
	private Double grade2;
	private Double grade3;
	
	public Student() {
	}
	
	public Student(String name, Double grade1, Double grade2, Double grade3) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		
	}

	public String getName() {
		return name;
	}

	public Double getGrade1() {
		return grade1;
	}

	public Double getGrade2() {
		return grade2;
	}

	public Double getGrade3() {
		return grade3;
	}
	
	public Double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public Double missingPoints() {
		return 60 - finalGrade();
	}
	
	public String toString() {
		
		if(finalGrade() >= 60) {
			return "FINAL GRADE = " 
		+ String.format("%.2f", finalGrade())
		+ "\nPASS";
		
		}
		else {
			return "FINAL GRADE = " 
		+ String.format("%.2f", finalGrade()) 
		+ "\nFAILED " 
		+ "\nMISSING "
		+ String.format("%.2f", missingPoints())
		+ " POINTS";
		
		}
				
	}
	
}
