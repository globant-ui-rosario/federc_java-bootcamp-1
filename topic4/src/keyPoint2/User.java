package keyPoint2;

public class User {

	private String dni;
	private String name;
	public User() {		
	}
	public User(String name) {	
		this.setName(name);
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
