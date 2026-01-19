package TopBrainsWrapperClass;

public class UniversityGradingSystemWithWrapperComparisionRules {
	public static void main(String[] args) {
		CourseResult cr1 = new CourseResult(70,80);
		CourseResult cr2 = new CourseResult(60,null);
		CourseResult cr3 = new CourseResult(30,35);
		
		Student2[] student = {
				new Student2(101,"Neel",cr1),
				new Student2(102,"Pooja",cr2),
				new Student2(103,"Aarav",cr3)
		};
		
		GradingService gs = new GradingService();
		
		for(Student2 s: student) {
			gs.generateResult(s);
		}
	}
}

class CourseResult{
	private Integer internalMarks;
	private Integer externalMarks;
	
	CourseResult(Integer internalMarks,Integer externalMarks){
		this.internalMarks = internalMarks;
		this.externalMarks = externalMarks;
	}
	
	public Integer getInternalMarks() {
		return internalMarks;
	}
	
	public Integer getExternalMarks() {
		return externalMarks;
	}
}

class Student2{
	private Integer studentId;
	private String name;
	private CourseResult result;
	
	Student2(Integer studentId,String name,CourseResult result){
		this.studentId = studentId;
		this.name = name;
		this.result = result;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public CourseResult getResult() {
		return result;
	}
}

class GradingService{
	public Integer calculateFinalScore(Student2 s) {
		CourseResult c = s.getResult();
		
		if(c.getInternalMarks() == null || c.getExternalMarks() == null) {
			return null;
		}
		
		Integer internal = (int) (c.getInternalMarks() * 0.40);
		Integer external = (int) (c.getExternalMarks() * 0.60);
		
		return internal + external;
	}
	
	public String assignGrade(Student2 s) {
		Integer marks = calculateFinalScore(s);
		
		if(marks == null) {
			return "Result Incomplete";
		}
		else if(marks >= 75) {
			return "Grade A";
		}
		else if(marks >= 60) {
			return "Grade B";
		}
		else if(marks >= 40) {
			return "Grade C";
		}
		else {
			return "Fail";
		}
		
	}
	
	public void generateResult(Student2 s) {
		Integer finalScore = calculateFinalScore(s);
		String grade = assignGrade(s);
		
		if(finalScore == null) {
			System.out.println(s.getName() + " --> Result Incomplete");
			return;
		}
		
		System.out.println(s.getName() + " --> Final Score: "+finalScore + " --> "+ grade);
	}
}


