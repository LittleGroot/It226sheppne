package asg1;

public class operations {
	public double[] quadraticFormula(double a,double b,double c)
	{
		double[] array = new double[2];
		
		double one;
		double two;
		
		one = (-b+(Math.sqrt((b*b))-4*a*c))/(2*a);
		two = (-b-(Math.sqrt((b*b))-4*a*c))/(2*a);
		
		array[0] = one;
		array[1] = two;
		
		return array;
		
	}
}
