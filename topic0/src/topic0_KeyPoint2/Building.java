package topic0_KeyPoint2;

public class Building {

	
	private String common_location; // where its located
	private String purpose; // who live there, what for, etc
	
	
	public String getCommon_location() {
		return common_location;
	}
	public void setCommon_location(String common_location) {
		this.common_location = common_location;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String toString() {
		return "Common location: :" + common_location + ", Purpose:" + purpose;
	}
}
