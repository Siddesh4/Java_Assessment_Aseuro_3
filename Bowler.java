package task3;

public class Bowler {
	/*
	 * 1. Instance variables: name: String, wickets: int, matches: int,
	 * balls_bowled: int, runs_conceded: int.
	 */
	private String name;
	private int wickets;
	private int matches;
	private int ball_bowled;
	private int runs_conceded;

	/*
	 * 2. Create a default constructor that assigns default values to instance
	 * variables.
	 */
	// the compiler will add default constructor by its own

	/*
	 * 3. Create parameterized constructor that accepts name, wickets, matches,
	 * balls_bowled, runs_conceded.
	 * 
	 */

	public Bowler(String name, int matches, int ball_bowled, int wickets, int runs_conceded) {
		super();
		this.name = name;
		this.wickets = wickets;
		this.matches = matches;
		this.ball_bowled = ball_bowled;
		this.runs_conceded = runs_conceded;
	}

	public Bowler() {
		// TODO Auto-generated constructor stub
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getBall_bowled() {
		return ball_bowled;
	}

	public void setBall_bowled(int ball_bowled) {
		this.ball_bowled = ball_bowled;
	}

	public int getRuns_conceded() {
		return runs_conceded;
	}

	public void setRuns_conceded(int runs_conceded) {
		this.runs_conceded = runs_conceded;
	}

	/*
	 * 4. Create below methods, Method name: computeBowlingAverage Return type: void
	 */
	public void computeBowlingAverage() {
		/*
		 * This method should print the bowling average of the bowler by dividing
		 * runs_conceded with wickets. Note: a. If any values are negative print
		 * 'Error'. b. If runs_conceded or balls_bowled are greater than 0 when matches
		 * are 0 print 'Error'.
		 */
		if (ball_bowled < 0 || matches < 0 || runs_conceded < 0 || wickets < 0) {
			System.out.println("computeBowlingAverage - Negitive Value Error");
			return;
		} 
		if ((runs_conceded > 0 && ball_bowled > 0) && matches == 0) {
			System.out.println("computeBowlingAverage - Error (>0 condition) ");
			return;
		} else
			System.out.println("The Bowling average of " + this.name + " is :" + ((float)runs_conceded / (float)wickets));
	}

	/*
	 * Method name: showStatistics Return type: void This method should print the
	 * details of the batsman. Note: a. If any values are negative print 'Error'. b.
	 * If runs_conceded or balls_bowled are greater than 0 when matches are 0 print
	 * 'Error'.
	 */
	public void showStatistics() {
		if (ball_bowled < 0 || matches < 0 || runs_conceded < 0 || wickets < 0) {
			System.out.println("showStatistics - Negitive Value Error");
			return;
		} 
		if ((runs_conceded > 0 && ball_bowled > 0) && matches == 0) {
			System.out.println("showStatistics - Error (>0 condition) ");
			return;
		} else {
			System.out.println("Name : " + name + " Matches : " + matches + " Wickets : " + wickets + " ball_bowled : "
					+ ball_bowled + " runs_conceded : " + runs_conceded);
			return;
		}
	}

	/*
	 * Method name: computeStrikeRate Return type: void This method should print the
	 * Strike Rate of the bowler by dividing runs_conceded with balls_bowled. Note:
	 * a. If any values are negative print 'Error'. b. If runs_conceded or
	 * balls_bowled are greater than 0 when matches are 0 print 'Error'. Given a
	 * class Testing that contains main method. Use this class to test your code.
	 */
	public void computeStrikeRate() {
		if (ball_bowled < 0 || matches < 0 || runs_conceded < 0 || wickets < 0) {
			System.out.println("Negitive Value Error");
			return;
		}
		if ((runs_conceded > 0 && ball_bowled > 0) && matches == 0) {
			System.out.println("computeStrikeRate-- Error");
			return;
		} else {
			// Tried different ways to divide two integer show 0.0 ,but expected result was
			// double (0.52*) typed so
			// applying type casting help get division
			System.out.println("Strike Rate : " + ((double) runs_conceded / (double) ball_bowled));
		}
	}
}