public class RoachPopulationDriver {
	public static void main(String[] args) {
		RoachPopulation population = new RoachPopulation(18);
		population.breed(); 
		population.spray();
		int p = population.getRoaches();
		System.out.println(p);
	}
	
	
}
