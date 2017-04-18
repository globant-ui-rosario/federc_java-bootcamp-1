package topic0_Ex1;

public class HospitalBuildingBuilder implements BuildingBuilder {

	private Building building;
	
	@Override
	public void buildcommon_location() {
		building.setCommon_location("cities");
	}

	@Override
	public void buildpurpose() {
		building.setPurpose("heal people");
	}

	@Override
	public Building getBuilding() {
		
		return building;
	}

}
