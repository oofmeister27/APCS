/**
   	* 
    * @author Aarav Navani
    * @period 3
    */
/**
 * Taxes class - class used to calculate the federal, social security and state taxes
 */

public class Taxes {
	/** holds the number of hours worked, the hourly rate, and the tax rates */
	private double hoursWorked;
	/** # of hours worked */
	private double hourlyRate;
	/** hourly rate */
	private final double FEDERALTAX = 0.15;
	/** federal tax */
	private final double FICATAX = 0.0765;
	/** fic tax */
	private final double STATETAX = 0.04;
	/** state tax */
	
	/**
	 * parameter constructor
	 * @param myHoursWorked - parameter to take in the number of hours worked
	 * @param myHourlyRate  - parameter to take in the hourly rate
	 */
	public Taxes(double myHoursWorked, double myHourlyRate) {
		hoursWorked = myHoursWorked;
		hourlyRate = myHourlyRate;
	}

	/**
	 * <b>summary</b>: provides a method getting the hours worked - this returns the
	 * hours worked
	 * 
	 * @return hours worked
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * <b>summary</b>: provides a method getting the hourly rate - * this returns
	 * the hourly rate
	 * 
	 * @return hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * <b>summary</b>: provides a method getting the federal tax - * this returns
	 * the federal tax
  	 * 
	 * @return federal tax rate
	 */
	public double getFedTaxRate() {
		return FEDERALTAX;
	}

	/**
	 * <b>summary</b>: provides a method getting the FICA tax - * this returns the
	 * FICA tax
	 * 
	 * @return FICA tax rate
	 */
	public double getSocSecurityRate() {
		return FICATAX;
	}

	/**
	 * <b>summary</b>: provides a method getting the state tax - * this returns the
	 * State tax
	 * 
	 * @return state tax rate
	 */
	public double getStateTaxRate() {
		return STATETAX;
	}

	/**
	 * <b>summary</b>: provides a method getting the gross pay - * this returns the
	 * hoursMultipled by the hourlyRate * also known as the gross pay
	 * 
	 * @return gross pay
	 */
	public double computeGrossPay() {
		return (hoursWorked * hourlyRate);
	}

	/**
	 * <b>summary</b>: provides a method calculating the federal tax on the gross
	 * pay- * this returns the amount of federal tax
	 * 
	 * @return fed tax
	 */
	public double computeFedTax() {
		return (FEDERALTAX) * computeGrossPay();
	}

	/**
	 * <b>summary</b>: provides a method calculating the FICA tax on the gross pay -
	 * * this returns the amount of FICA tax
	 * 
	 * @return fica tax
	 */
	public double computeSocSecurity() {
		return (FICATAX) * computeGrossPay();
	}

	/**
	 * <b>summary</b>: provides a method calculating the state tax on the gross pay
	 * - * this returns the amount state tax
	 * 
	 * @return state tax
	 */
	public double computeStateTax() {
		return (STATETAX) * computeGrossPay();
	}

	/**
	 * <b>summary</b>: provides a method getting the total pay - * this returns the
	 * gross pay minus all the taxes
	 * 
	 * @return total minus taxes
	 */
	public double computeTotalTax() {
		return (computeFedTax() + computeSocSecurity() + computeStateTax());
	}

	/**
	 * <b>summary</b>: provides a method getting the total pay - * this returns the
	 * gross pay minus all the taxes
	 * 
	 * @return net pay
	 */
	public double computeNetPay() {
		return (computeGrossPay() - computeTotalTax());
	}

}