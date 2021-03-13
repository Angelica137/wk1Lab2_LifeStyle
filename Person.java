
/**
 * To demonstrate boolean.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person {
	double cmHeight = 160;
	double kgWeight = 55;
	boolean smoker = true;
	int weeklyAlcholUnits = 10;
	final int RWAL = 21; // RWAL - Recommended Weekly Alcohol Limit
	int restPulse = 100;
	char gender = 'f';

	public void checkPulse() {
		boolean healthyPulse;
		healthyPulse = ((restPulse > 30) && (restPulse < 180));
		System.out.print("Healthy pulse = ");
		System.out.println(healthyPulse);
	}

	public void checkForAbuse() {
		boolean abuser;
		abuser = ((weeklyAlcholUnits > RWAL) || (smoker));
		System.out.print("Checking for abuse -- ");
		System.out.println(abuser);

	}

	public void displayDetails() {
		// display all the details of a person
		System.out.println(cmHeight);
		System.out.println(kgWeight);
		System.out.println(smoker);
		System.out.println(weeklyAlcholUnits);
		System.out.println(RWAL);
		System.out.println(restPulse);
	}

}
