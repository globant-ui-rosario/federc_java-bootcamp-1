package keyPoint2;

public class UserServiceImplementation implements UserService {
	
	private DataUser dataUser;
	
	public UserServiceImplementation(){
		dataUser = new DataUser();
	}

	@Override
	public User getByDni(int dni) {
		return dataUser.getByDni(dni);
	}

}
