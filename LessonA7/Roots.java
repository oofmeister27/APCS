/**
 * @author Aarav Navani
 * period 3
 */
import java.util.Scanner;

public class Roots {
	/**
	 * calculate the roots of quadratic equations
	 */
	public void calculate() 
	{
		double E1_Root1 = 0.0;
		double E1_Root2 = 0.0;
		double E2_Root1 = 0.0;
		double E2_Root2 = 0.0;
		double E3_Root1 = 0.0;
		double E3_Root2 = 0.0;
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter the coefficients a b and c for equation 1: ");
		double a1 = in.nextDouble();
		double b1 = in.nextDouble();
		double c1 = in.nextDouble();
		System.out.printf("Enter the coefficients a b and c for equation 2: ");
		double a2 = in.nextDouble();
		double b2 = in.nextDouble();
		double c2 = in.nextDouble();
		System.out.printf("Enter the coefficients a b and c for equation 3: ");
		double a3 = in.nextDouble();
		double b3 = in.nextDouble();
		double c3 = in.nextDouble();
		
		E1_Root1 = (-b1+Math.sqrt((b1*b1)-(4*a1*c1)))/(2*a1);
		E1_Root2 = (-b1-Math.sqrt((b1*b1)-(4*a1*c1)))/(2*a1);
		
		
		E2_Root1 = (-b2+Math.sqrt((b2*b2)-(4*a2*c2)))/(2*a2);
		E2_Root2 = (-b2-Math.sqrt((b2*b2)-(4*a2*c2)))/(2*a2);	
		
		E3_Root1 = (-b3+Math.sqrt((b3*b3)-(4*a3*c3)))/(2*a3);
		E3_Root2 = (-b3-Math.sqrt((b3*b3)-(4*a3*c3)))/(2*a3);	
		
		System.out.printf("%20s%10s%10s%11s%11s", "a:", "b:", "c:", "root1:", "root2:\n");
		System.out.printf("%10s%10.2f%10.2f%10.2f%11.2f%11.2f\n", "#1", a1, b1, c1, E1_Root1, E1_Root2);
		System.out.printf("%10s%10.2f%10.2f%10.2f%11.2f%11.2f\n", "#2", a2, b2, c2, E2_Root1, E2_Root2);
		System.out.printf("%10s%10.2f%10.2f%10.2f%11.2f%11.2f\n", "#3", a3, b3, c3, E3_Root1, E3_Root2);
	}
}