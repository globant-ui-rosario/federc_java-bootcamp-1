package keyPoint2;

public class UserServiceImplementation implements UserService {
	
	private DataUser dataUser;
	
	public UserServiceImplementation(DataUser dataUser){
		this.setDataUser(dataUser);
	}

	public void setDataUser(DataUser dataUser) {
		this.dataUser = dataUser;
	}

	@Override
	public User getByDni(String dni) {
		return dataUser.getByDni(dni);
	}

}
