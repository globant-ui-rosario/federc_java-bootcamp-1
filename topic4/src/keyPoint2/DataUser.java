package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class DataUser {
	
	private List<User> usersCollection = new ArrayList<User>();

	public User getByDni(String dni) {
		User user = null;
		for(User u : usersCollection){
			if(u.getDni().equals(dni)){
				user = u;
			}
		}
		return user;
	}

}
