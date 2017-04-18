package topic0_Ex1;

public class BuildingDirector {
	
	private BuildingBuilder buildingBuilder = null;

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
