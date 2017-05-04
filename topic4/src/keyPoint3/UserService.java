package keyPoint3;

public interface UserService {
	/** 
	 * This method receives a dni from user. Then, searches and returns the specific user
	 * @author Aguirre Federico working on Java Bootcamp 2017
	 * @param receives a dni
	 * @return a specific user
	 */	
	public User getByDni(String dni); 
}
