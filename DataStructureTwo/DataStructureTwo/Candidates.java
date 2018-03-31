package DataStructureTwo;
/**
 * 
 * @author Vinod Patel
 *
 */
public class Candidates implements Comparable<Candidates>{

	private String name;
	private int marks;
	private String clgName;
	
	public Candidates(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getMarks(){
		return this.marks;
	}
	
	public String getClgName(){
		return this.clgName;
	}

	public void setClgName(String collegeName) {
		this.clgName = collegeName;
	}
	@Override
	public int compareTo(Candidates candidate) {
		int compare = 1;
		if( this.marks > candidate.marks)
			compare =  -1;
		else if( this.marks == candidate.marks)
			compare = 0;
		
		return compare;
	}
}
