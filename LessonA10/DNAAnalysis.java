/**
 * Last name: Navani
 * First name: Aarav
 * Student ID: 53061527
 * Period: 3
 *
 */
public class DNAAnalysis {
	private static final String PICARD = "ACGTTCGAGATCGA";
	private static final String RICKER = "CGTAGATCATGACGA";
	private static final String TROI = "GTACCAGTACGATCAG";
	private static final String LAFORGE = "GATCGATGTGCAGACTAGCGAT";
	private static final String WORF = "ACTGGTCA";

	
	/**
	 * Checks if the given DNA sequence has the Picard's syndrome
	 * @param dna - DNA sequence
	 * @return true if the Picard's genetic mutation is in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isPicard(String dna) {
		if (dna.indexOf(PICARD) != -1) {
		   return true;
		}
		else {
		   return false;
		}

	}
	/**
	 * Checks if the given DNA sequence has the Riker's syndrome
	 * @param dna - DNA sequence
	 * @return true if the Riker's genetic mutation is in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isRiker(String dna) {
		if (dna.indexOf(RICKER) != -1) {
		   return true;
		}
		else {
		   return false;
		}

	}
	/**
	 * Checks if the given DNA sequence has the Troi syndrome
	 * @param dna - DNA sequence
	 * @return true if the Troi genetic mutation is in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isTroi(String dna) {
		if (dna.indexOf(TROI) != -1) {
		   return true;
		}
		else {
		   return false;
		}

	}
	/**
	 * Checks if the given DNA sequence has the LaForge syndrome
	 * @param dna - DNA sequence
	 * @return true if the LaFprge genetic mutation is in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isLaForge(String dna) {
		dna = dna.substring(0, 40);
		if (dna.indexOf(LAFORGE) != -1) {
		   return true;
		}
		else {
		   return false;
		}

	}
	/**
	 * Checks if the given DNA sequence has the Worf syndrome
	 * @param dna - DNA sequence
	 * @return true if the Worf genetic mutation is in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isWorf(String dna) {
		dna = dna.substring(dna.length()-40, dna.length());
		if (dna.indexOf(WORF) != -1) {
		   return true;
		}
		else {
		   return false;
		}

	}
	/**
	 * Checks if the given DNA sequence has any mutation
	 * @param dna - DNA sequence
	 * @return true if there is no genetic mutation in the given DNA sequence
	 *  			false otherwise
	 */
	public static boolean isHealthy(String dna) {
		if (isPicard(dna) || isRiker(dna) || isTroi(dna) || isLaForge(dna) || isWorf(dna)) {
		   return false;
		   
		}
		else {
		   return true;
		}

	}
	/**
	 * Returns a message with all the genetic mutations present in the dna sequence
	 * @param dna - DNA sequence
	 * @return - String containing all the genetic mutations if any is present, "Patient is healthy!" 
	 * 			message if the DNA sequence has no mutation
	 */
	public static String toString(String dna) {
		if (isHealthy(dna) != true) {
		   System.out.println("Patient");
		}
		if (isPicard(dna))
		   System.out.println(" has Picard's Syndrome");
		if (isRiker(dna)) 
		   System.out.println(" has Riker's Syndrome");
		if (isTroi(dna)) 
		   System.out.println(" has Troi Syndrome");
		if (isLaForge(dna)) 
		   System.out.println(" has LaForge Syndrome");
		if (isWorf(dna))
		   System.out.println(" has Worf Syndrome");
   
      if (isHealthy(dna) == true) {
         return "Patient is healthy!";
      }
      else {
         return "";
      }

	}
}




