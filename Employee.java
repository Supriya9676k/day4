public class Employee{
	
	private int employee_id;
	private String employee_name;
	private String employee_salary="10000";
	public void setEmployee_id(int employee_id){
		this.employee_id=employee_id;
	}
	public void setEmployee_name(String employee_name){
		this.employee_name=employee_name;
	}
	public int getEmployee_id(){
		return employee_id;
	}
	public String getEmployee_name(){
		return employee_name;
	}
	
	public String getEmployee_salary(){
		return employee_salary;
	}
	
	}
