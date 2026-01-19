package TopBrainsWrapperClass;

public class OnlineVotingEligibilityChecker {
	public static void main(String[] args) {
		Voter[] voters = {
			new Voter(1,"Aman","25"),
			new Voter(2,"Neha","17"),
			new Voter(3,"Rahul","abc"),
		};
		
		VotingService vs = new VotingService();
		
		for(Voter v : voters) {
			vs.displayStatus(v);
		}
	}
}

class Voter{
	private Integer voterId;
	private String voterName;
	private String age;
	
	Voter(Integer voterId,String voterName,String age){
		this.voterId = voterId;
		this.voterName = voterName;
		this.age = age;
	}
	
	public Integer getVoterId(){
		return voterId;
	}
	
	public String getVoterName(){
		return voterName;
	}
	
	public String getAge(){
		return age;
	}
}

class VotingService{
	public Integer parseAge(Voter v) {
		try {
			int age = Integer.valueOf(v.getAge());
			return age;
		}
		catch(NumberFormatException e) {
			return null;
		}
	}
	
	public Integer isEligible(Voter v) {
		Integer age = parseAge(v);
		if(age == null) {
			return null;
		}
		return age;
	}
	
	public void displayStatus(Voter v) {
		Integer age = isEligible(v);
		if(age == null) {
			System.out.println(v.getVoterName()+" --> Invalid Age Input");
		}
		else if(age < 18) {
			System.out.println(v.getVoterName()+" --> Not Eligible to Vote");
		}
		else {
			System.out.println(v.getVoterName() + " --> Eligible to Vote");
		}
	}
}
