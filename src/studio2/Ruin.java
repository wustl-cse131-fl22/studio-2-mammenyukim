package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new  Scanner(System.in);
		System.out.println("Enter your start amount: ");
		int startAmount = scan.nextInt();
		System.out.println("Enter the win chance: ");
		double winChance = scan.nextDouble();
		System.out.println("Enter the win limit: ");
		int winLimit = scan.nextInt();
		int totalSimulations = 0;
		int numPlays = 0;
		
		while (startAmount < winLimit && startAmount > 0)
		{
			if (Math.random() < winChance)
			{
				startAmount++;
				numPlays ++;
			}
			else 
			{
				startAmount--;
				numPlays ++;
			}
			System.out.println("Simulation: " + totalSimulations);
			totalSimulations ++;
		}

		if (startAmount == 0)
			System.out.println("Ruin");
		if (startAmount == winLimit)
			System.out.println("Success");
		
		
		
	}

}
