package TopBrainsWrapperClass;

public class SmartExamResult {
	public static void main(String[] args) {
		Student[] student = {
			new Student(1,"Asha",70,65,60),	
			new Student(1,"Rohan",35,null,40),
			new Student(1,"Kiran",30,25,20)
		};
		
		ResultService rs = new ResultService();
		
		for(Student s : student) {
			int total = rs.calculateTotal(s);
			double avg = rs.calculateAverage(s);
			String result = rs.isPassed(s) ? "Pass" : "Fail";
			
			System.out.println(s.getStudentName()+" --> "+ "Total: "+total +" --> "+"Avg: "+(int)avg+" --> " + result);
		}
	}
}

class Student{
	private Integer studentId;
	private String studentName;
	private Integer mathMarks;
	private Integer scienceMarks;
	private Integer englishMarks;
	
	Student(Integer studentId,String studentName,Integer mathMarks,Integer scienceMarks,Integer englishMarks){
		this.studentId = studentId;
		this.studentName = studentName;
		this.mathMarks = mathMarks;
		this.scienceMarks = scienceMarks;
		this.englishMarks = englishMarks;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public Integer getMathMarks() {
		return mathMarks;
	}
	
	public Integer getScienceMarks() {
		return scienceMarks;
	}
	
	public Integer getEnglishMarks() {
		return englishMarks;
	}
}

class ResultService{
	public int getSafeMarks(Integer marks) {
		if(marks != null) {
			return marks;
		}
		return 0;
	}
	
	public int calculateTotal(Student s) {
		return getSafeMarks(s.getEnglishMarks()) + getSafeMarks(s.getMathMarks()) + getSafeMarks(s.getScienceMarks());
	}
	
	public double calculateAverage(Student s) {
		 return calculateTotal(s)/3.0;
	}
	
	public boolean isPassed(Student s) {
		return calculateAverage(s) >= 40;
	}
	
}