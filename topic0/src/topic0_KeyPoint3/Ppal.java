package topic0_KeyPoint3;

public class Ppal {
	
	public static void main(String[] args) {
		HospitalFactory hFactory = new HospitalFactory();

		Hospital h1 = hFactory.getHospital("about children");
		System.out.println("hospital 1 speciality: " + h1.setSpeciality());

		Hospital h2 = hFactory.getHospital("general care");
		System.out.println("hospital 2 speciality: " + h2.setSpeciality());
	}

}
