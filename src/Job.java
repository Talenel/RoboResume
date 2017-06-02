
public class Job {
	
	private String role;
	private long salary;
	private int id;
	private String name;
	private String startDate;
	private String endDate;
	private String company;
	
	public Job(String aName, String aCompany, String aRole, long aSalary, int aID, String aStartDate)
	{
		role=aRole;
		salary=aSalary;
		id=aID;
		name=aName;
		startDate=aStartDate;
		endDate="Present";
		company=aCompany;
		
	}
	public Job(String aName, String aCompany, String aRole, String aStartDate, String anEndDate)
	{
		role=aRole;
		name=aName;
		startDate=aStartDate;
		endDate=anEndDate;
		company=aCompany;
		
	}
	
	
	public String getRole() {
	    return role;
	}
	
	public void setRole(String role) {
	    this.role = role;
	}
	
	public long getSalary() {
	    return salary;
	}
	
	public void setSalary(long salary) {
	    this.salary = salary;
	}
	
	public int getId() {
	    return id;
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	public String getStart()
	{
		return startDate;
	}
	
	public String getEnd()
	{
		return endDate;
	}
	
	public void setEnd(String anEndDate)
	{
		endDate=anEndDate;
	}
	public void setStart(String aStartDate)
	{
		startDate=aStartDate;
	}
	
	
	public String toString()
	{
		
		return  name+":\n"+company+", " +startDate+" - "+endDate+"\n"+role+"\n";
		
	}
	
}
