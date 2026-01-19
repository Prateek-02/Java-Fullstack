package TopBrainsEnum;

public class OnlineExamEvaluationEngine {
	public static void main(String[] args) {
		Exam mcqExam = new MCQExam("Ex101",65,100);
		Exam codingExam = new CodingExam("Ex102",45,100);
		
		ResultProcessor rs = new ResultProcessor();
		
		rs.processResult("S101", mcqExam);
		rs.processResult("S102", codingExam);
	}
}

enum ExamType{
	MCQ{
		@Override
		public boolean evaluate(double score,double totalMarks) {
			double percentage = (score/totalMarks) * 100;
			return percentage >= 60;
		}
	},
	DESCRIPTIVE{
		@Override
		public boolean evaluate(double score,double totalMarks) {
			double percentage = (score/totalMarks) * 100;
			return percentage >= 50;
		}
		
	},
	CODING{
		@Override
		public boolean evaluate(double score,double totalMarks) {
			double percentage = (score/totalMarks) * 100;
			return percentage >= 70;
		}
	};
	
	public abstract boolean evaluate(double score, double totalMarks);
	
}

abstract class Exam{
	private String examId;
	private double score;
	private double totalMarks;
	private ExamType examType;
	
	public Exam(String examId, double score, double totalMarks, ExamType examType) {
		this.examId = examId;
		this.score = score;
		this.totalMarks = totalMarks;
		this.examType = examType;
	}

	public ExamType getExamType() {
		return examType;
	}
	
	 public boolean evaluate() {
		 return examType.evaluate(score, totalMarks);
	 }

}

class MCQExam extends Exam{
	MCQExam(String examId,double score,double totalMarks){
		super(examId,score,totalMarks,ExamType.MCQ);
	}
}

class CodingExam extends Exam{
	CodingExam(String examId, double score, double totalMarks) {
        super(examId, score, totalMarks, ExamType.CODING);
    }
}

class ResultProcessor{
	public void processResult(String studentId,Exam exam) {
		boolean passed = exam.evaluate();
		
		if(passed) {
			System.out.println("Student "+studentId+" passed "+exam.getExamType()+" exam");
		}
		else {
			System.out.println("Student "+studentId+" failed "+exam.getExamType()+" exam");
		}
	}
}



