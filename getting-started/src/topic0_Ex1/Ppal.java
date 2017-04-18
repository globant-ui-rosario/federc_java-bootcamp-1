package topic0_Ex1;

public class Ppal {
	
	public static void main(String[] args) {

		BuildingBuilder buildingBuilder = new StadiumBuildingBuilder();
		BuildingDirector buildingDirector = new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		Building building = buildingDirector.getBuilding();	
		System.out.println("building is: " + building);
		
		buildingBuilder = new HospitalBuildingBuilder();
		buildingDirector = new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		building = buildingDirector.getBuilding();	
		System.out.println("building is: " + building);
	}

}
