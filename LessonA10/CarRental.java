/**
 * 
 * Last name: Navani
 * First name: Aarav
 * ID: 53061527
 * Period: 3
 *
 */
/** Determine the special car rental code from a license plate
 */
public class CarRental {
	private String makeOfCar; // make of car
	private String modelOfCar; // car model
	private String licensePlateOfCar; // license plate
	private String carCode; // code of car

	/**
	 * Regular constructor to initialize make, model, and license plate of car
	 * 
	 * @param make
	 *            - make of car
	 * @param model
	 *            - model of car
	 * @param licensePlate
	 *            - license plate of car
	 */
	public CarRental(String make, String model, String licensePlate) {
		makeOfCar = make;
		modelOfCar = model;
		licensePlateOfCar = licensePlate;

	}

	/**
	 * Method to compute rental code of car, using the license plate
	 */
	public void computeCode() {
		char letter1 = licensePlateOfCar.charAt(0);
		char letter2 = licensePlateOfCar.charAt(1);
		char letter3 = licensePlateOfCar.charAt(2);
		int sum = (int) letter1 + (int) letter2 + (int) letter3;
		sum = sum + (licensePlateOfCar.charAt(4) - 48) * 100
				+ (licensePlateOfCar.charAt(5) - 48) * 10
				+ (licensePlateOfCar.charAt(6) - 48);
		int alphabetNumber = sum % 26;
		char letter = (char) (65 + alphabetNumber);
		carCode = "" + letter + sum;

	}

	/**
	 * Method to retrieve rental car code
	 * 
	 * @return - car code
	 */
	public String getCode() {
		return carCode;
	}

	/**
	 * Method to print out make, model, license plate, and car
	 * code on separate lines
	 * 
	 * @return - string output
	 */
	public String toString() {
		System.out.print("Make: ");
		System.out.print("Model: ");
		System.out.print("License Plate: ");
		System.out.println("Make = " + makeOfCar);
		System.out.println("Model = " + modelOfCar);
		computeCode();
		String licenseAndCode = (licensePlateOfCar + " = " + carCode);
		System.out.println(licenseAndCode);
		
		return "";
	}

}

