package topic0_KeyPoint2;

public class BuildingDirector {
	
	private BuildingBuilder buildingBuilder;

	public BuildingDirector(BuildingBuilder buildingBuilder) {
		this.buildingBuilder = buildingBuilder;
	}

	public void constructBuilding() {

		buildingBuilder.buildcommon_location();
		buildingBuilder.buildpurpose();
		
	}

	public Building getBuilding() {
		return buildingBuilder.getBuilding();
	}

}
