import java.util.Scanner;
public class Homework02 {
//Tyrel Hamilton
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int choice0 = 0;
		int choice1 = 0;
		int choice2 = 0;
		String again = "yes"; //Declared as "yes" so that the while may begin. I could do a do-while instead.
		
		while (again.equalsIgnoreCase("yes")) {//The while statement is here to offer the ability to replay
		
		
			System.out.println("You find youself admist a crowd. Suddenly, someone shouts out your name and \ndemands you to fight them. What do you say? Enter numeric value:\n(1)Say yes\n(2)Say no");
			choice0 = key.nextInt();
			
			
			if (choice0 == 2) {
				System.out.println("They call you a baby. Will you...\n(1)Stand on business\n(2)Let it slide\n(3)Flirt");
				choice1 = key.nextInt(); // If choice 3 is selected, it will jump to line 121
				if (choice1 == 2) {
					System.out.println("You take a deep breath and say \"I have no enemies.\" You then walk away \nas the whole crowd watches. Although you did not fight, you truly won.");
					System.out.println("ENDING 1: NO ENEMIES"); //ENDING ONE
				} else if (choice1 == 3)
					choice2 = 1;
			} 
			
			if (choice0 == 1 || choice1 == 1) {
				System.out.println("You agree to the challenge and now you and your opponent are standing a \ncouple feet from you. What will you do?\n(1)Charge at them\n(2)Wait for their move");
				choice0 = key.nextInt();
				if (choice0 == 2) { //WAIT
					System.out.println("You decide to let your opponent make the first move so that you \nmay counter attack. However, it seems they thought of the same thing. \nYou're in a standoff, what will you do?\n(1)Make a move\n(2)Do an backflip\n(3)Do nothing");
					choice1 = key.nextInt();
				
					if (choice1 == 2) {
						System.out.println("Turns out you're unnecessary backflip wasn't all useless. You \nwere able to dodge a grab from of the thug's friends. Now What?\n(1)Throw a punch\n(2)Hit 'em with a dropkick\n(3)Do another backflip");
						choice0 = key.nextInt();
						if (choice0 == 1) {
							System.out.println("You threw a normal punch after that cool backflip. The punch \nlacked coolness and was therefore weak. You proceeded to get beaten up.\nGAME OVER :(");
							System.exit(0);
						} else if (choice0 == 2) {
							System.out.println("You proceed to jump in the air and land a dropkick on your \nopponent. They are stunned at your power. Now what will you do?\n(1)Final Flash\n(2)Monologue\n(3)Kamehameha");
							int finalFlash = 0;
							String shout = "";
							choice0 = key.nextInt();
							if (choice0 == 1) {
								System.out.println("Trivia Time! How much damage does the Final Flash do?");
								finalFlash = key.nextInt();
								if (finalFlash <= 9000) { //This is a DragonBall reference. If you don't understand, just look up "It's over 9000"
									System.out.println("Your final flash was simply too weak, just like in the show. \nYour opponent tanks it and beats you up. \nGAME OVER :(");
									System.exit(0);
								}
							} else if (choice0 == 2) {
								System.out.println("You begin to monologue about power and friendship. Your opponent \ngets bored and knocks you out in one punch. \nGAME OVER :(");
								System.exit(0);
							} 
							if (choice0 == 3 || finalFlash > 9000) { //This is a compound boolean and a Numerical comparison
								System.out.println("Your attack completely evicerates your opponent. The crows cheers. A \nlittle overkill, maybe, But you won!");
								System.out.println("ENDING 9: OVERKILL"); //ENDING NINE. NOTE: Ending 9 comes before ending two before it takes more to get there. Getting to ending 2 only takes 3 choices
								choice0 = 0;
							}
						} else if (choice0 == 3) {
							System.out.println("You did another backflip. Not Sure why, but it was cool enough to \nget the crowd, and even your opponent, to cheer. They celebrate you \nbecause you're so cool. So technically, you won!");
							System.out.println("ENDING 8: WAY PAST COOL"); //ENDING EIGHT
						}
					} else if (choice1 == 3) {
						System.out.println ("As you continued to stand there you are wrapped up by one of your \nopponent's buddies. They proceed to jump you and not let you \nfight back. Before you're beaten though, your friends jump in and \nreverse-jump the two thugs. You emerge victorious though the\npower of friendship");
						System.out.println("ENDING 2: REVERSE JUMPING"); //ENDING TWO
					}
					
				} if (choice0 == 1 || choice1 == 1) { //CHARGE IN
					System.out.println("You decide to take control first and charge in. However, you really \ndidn't think of a plan of attack. You come up with a plan to...\n(1)Attack\n(2)Defend\n(3)Use the forbidden technique...");
					choice0 = key.nextInt();
					if(choice0 == 3) {
						choice2 = 1;
					}
					
					if (choice0 == 1) { //ATTACK
						System.out.println("You're attack connects and your opponent takes the blow. Now you...\n(1)Attack again\n(2)Defend yourself");
						choice0 = key.nextInt();
						if (choice0 == 1) {
							System.out.println("You land a fatal blow to your opponent as they fall to the ground\n knocked out cold. Well that was easy. You Won!");
							System.out.println("ENDING 3: WELL THAT WAS EASY"); //ENDING THREE
						} else if(choice0 == 2) {
							System.out.println("Your opponent threw a punch, but you blocked in. Now you'll...\n(1)Attack\n(2)Defend again");
							choice0 = key.nextInt();
							if (choice0 == 1) {
								System.out.println("Your attack lands...again. Now you'll...\n(1)Attack again\n(2)Defend");
								choice0 = key.nextInt();
								if (choice0 == 1) {
									System.out.println("You broke the pattern, only throwing yourself off. Your opponent \ntakes advantage of this and rocks you. Knocking you out.\nGAME OVER :(");
									System.exit(0);
								} else if (choice0 == 2) {
									System.out.println("You blocked...again. You continue this pattern of attacking and\ndefending until both of you tire out and both pass out\nfrom exhausting. You won...sorta.");
									System.out.println("ENDING 6: DOUBLE KO"); //ENDING SIX
								}
							} else if (choice0 == 2) {
								System.out.println("Your opponent got really angry with you blocking and threw an\nextra hard punch that broke your block and knocked you out.\nGAME OVER :(");
								System.exit(0);
							}
						}
					} else if (choice0 == 2) { //DEFEND
						System.out.println("Good call, as you charge you duck underneath you opponent's\nfist. Now you will...\n(1)Attack\n(2)Defend");
						choice0 = key.nextInt();
						if (choice0 == 1) {
							System.out.println("As you go to attack you're quickly met with your opponent's fist,\nquickly knocking you out\nGAME OVER :(");
							System.exit(0);
						} else if (choice0 == 2) {
							System.out.println("Excellent defense! You block the next attack. Now what will you do?\n(1)Attack\n(2)Defend\n(3)Lock in");
							choice0 = key.nextInt();
							if (choice0 == 1 || choice0 == 2) {
								System.out.println("Your opponent anticipated you would do that and sweeps your leg. As you land\non your back, you're kicked again, knocked out.\nGAME OVER :(");
								System.exit(0);
							} else if (choice0 == 3) {
								System.out.println("You lock in and flex your jaw muscles, mewing. You emit a sigma alpha aura.\nAny attack your oponent tries will not land. They tire themselves out\nand fall over, passing out from exaustion. Congrats!");
								System.out.println("ENDING 7: LOCKED IN"); //ENDING SEVEN
							}
						}
					}
				}
			} if (choice2 == 1) { //The path if the user chooses to "flirt" or "use the forbidden technique"
						System.out.println("You run your fingers through your hair and say \"I can be\nyour baby.\" Your attempts to rizz your opponent only leaves them in\nconfusion. Now what will you do?\n(1)Stand there akwardly\n(2)Rizz again");
						choice0 = key.nextInt();
						if (choice0 == 1) {
							System.out.println("The two of you stand there akwardly. Not knowing\nwhat to do, you both just walk away. A win is a win though. Congrats!");
							System.out.print("ENDING 4: THE SO-CALLED RIZZLER"); //ENDING FOUR
						} else if (choice0 == 2) {
							System.out.println("You caress your opponent's cheek, telling them that\neverything will be okay and that you're here for them.\nthese attempts somehow work and your opponent falls in love with you.\nYou carry them away bridal-style into the sunset. I guess you won?");
							System.out.println("ENDING 5: ENEMIES TO LOVERS"); //ENDING FIVE
						}
					}
				
			System.out.println("\nSpin it back? Enter \'yes\' or \'no\'");
			again = key.next();
			if(!(again.equalsIgnoreCase("yes"))) { //Uses a String comparison to exit the code if user inputs "no", if they input "yes" the game will reset
				System.out.println("okay bye whatever");
				System.exit(0);
			}
			}

		
		}

	}
