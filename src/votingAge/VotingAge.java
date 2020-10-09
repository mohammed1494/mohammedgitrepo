package votingAge;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		
		int age;
		String answer;
		boolean youranswer= true;
		
		Scanner votingage = new Scanner(System.in);
		System.out.println("Did you register to vote? Enter yes or no");
		answer = votingage.nextLine();
		System.out.println("What is your age? ");
		age = votingage.nextInt();
		
		if (answer.equals("yes") && age >=18) {
			youranswer = true;
			System.out.println("Great job since you are registerd, and your age is : " + age + " You are able to vote." + " Go vote!!!");
		}
		
		else if (answer.equals("no") && age >=18) {
			youranswer = false;
			System.out.println("You age is: " + age + " You are old enough to vote but you must register. Please go register to vote.");
		}
		
		else if (age <= 17){
				System.out.println("your age is " + age + " : " + "You are not able to vote or register ");}	
		else {
		}
		}



}
