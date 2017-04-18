package topic0_KeyPoint2;

public class StadiumBuildingBuilder implements BuildingBuilder {

	private Building building;
	

	@Override
	public void buildcommon_location() {
		building.setCommon_location("cities");

	}

	@Override
	public void buildpurpose() {
		building.setPurpose("entertainment");

	}

	@Override
	public Building getBuilding() {
		return building;
	}

}
