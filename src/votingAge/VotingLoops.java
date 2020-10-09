package votingAge;

public class VotingLoops {

	public static void main(String[] args) {
//		for (int i = 1; i <= 17; i = i + 1) {
//			System.out.println(i + " You are not old enough to vote");
//		}
		
//		int num = 45;
//		while(num>17) {
//			System.out.println(num + " " + "You are old enough to vote");
//			num--;
//		}
	  
		int num = 17;
		do {
			System.out.println(num + " " + "You are not old enough to vote");
			num--;
		} while (num >=1);
	
	}
}
