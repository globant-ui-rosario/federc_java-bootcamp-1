package keyPoint2;

public class User {

	private int dni;
	private String name;
	public User() {		
	}
	public User(String name) {	
		this.setName(name);
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
