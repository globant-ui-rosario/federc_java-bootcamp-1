package topic0_KeyPoint3;

public class HospitalFactory {
	
	public Hospital getHospital(String type) {
		if ("about children".equals(type)) {
			return new PediatryHospital();
		} else {
			return new InternalMedicinHospital();
		}
	}

}
