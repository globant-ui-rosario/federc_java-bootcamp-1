package topic0_KeyPoint3;

public class HospitalFactory {
	
	public Hospital getHospital(String type) {
		String speciality= "about children";
		if (speciality.equalsIgnoreCase(type)) {
			return new PediatryHospital();
		} else {
			return new InternalMedicinHospital();
		}
	}

}
