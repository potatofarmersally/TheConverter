
public class Measurement {
	//inches to centimeters 
	public static final double CENTIMETER = 2.54;
	
	private double myCm;
	private double myIn;
	
	/*
	 * Constructor for Measurement 
	 */
	public Measurement(double theInch) {
		//initializing values 
		myIn = theInch; 
		myCm = 0; 
	}
	
	public double convertToCm (int myIn) {
		myCm = myIn * CENTIMETER;
		return myCm; 
	}
	
}
