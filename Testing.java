package task3;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Bowler b1 = new Bowler("Siddesh", 1, 86, 2, 45); b1.computeBowlingAverage();
		 * b1.computeStrikeRate(); b1.showStatistics();
		 * 
		 * Bowler b2 = new Bowler("Siddesh-Invalid", 0, 100, 20, 458);
		 * b2.computeBowlingAverage(); b2.computeStrikeRate(); b2.showStatistics();
		 */

		Bowler b1 = new Bowler();
		System.out.println("Enter the values for Bowler 1");

		System.out.println("Please Enter Name");
		b1.setName(sc.nextLine());

		System.out.println("Enter the Number of matches played");
		b1.setMatches(sc.nextInt());

		System.out.println("Enter the number of ball bowled");
		b1.setBall_bowled(sc.nextInt());

		System.out.println("Enter number of wickets");
		b1.setWickets(sc.nextInt());

		System.out.println("Enter number of runs conceded");
		b1.setRuns_conceded(sc.nextInt());
		
		b1.computeBowlingAverage();
		
		b1.computeStrikeRate();
		
		b1.showStatistics();
		
		sc.close();
	}
}
