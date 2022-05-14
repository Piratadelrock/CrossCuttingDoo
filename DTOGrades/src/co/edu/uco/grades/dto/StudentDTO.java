package co.edu.uco.grades.dto;

public class StudentDTO {
	
	private int id;
	private String idNumber;
	private IdTypeDTO idType;
	private String name; 
	private String email;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public IdTypeDTO getIdType() {
		return idType;
	}
	public void setIdType(IdTypeDTO idType) {
		this.idType = idType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
