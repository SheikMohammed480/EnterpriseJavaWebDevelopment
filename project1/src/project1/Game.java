package project1;
import java.util.Scanner;
import java.util.Random;
public class Game {
     public void game(){
     try(Scanner sc=new Scanner(System.in)){
    	 
     
	 Random r=new Random();
	 int max,i,comCount=0,playerCount=0;
	 char choice;
	 String computerMove,playerMove;
	 System.out.println("Welcome to handGame ");
	 
	 System.out.print("Maximum Score  for this match:");
	 max=sc.nextInt();
	 sc.nextLine();
	 String s[]= {"Rock","Paper","Scissors"};
	 
	 for(i=1;i<=max*2-1;i++) {
		 if(comCount==max||playerCount==max)
		 {
			 System.out.println("End of this game");
			 break;
		 }
		  System.out.println("Enter your Move(Rock,paper,scissors):");
		  System.out.print("playerMove :");
		  playerMove=sc.nextLine();
		  computerMove=s[r.nextInt(s.length)];
		  
		 
		  if ((!playerMove.equalsIgnoreCase("rock")) && (!playerMove.equalsIgnoreCase("paper")) && (!playerMove.equalsIgnoreCase("scissors"))) {
	            System.out.println("Invalid move! Please enter rock, paper, or scissors.");
	        } else {
	            System.out.println("Computer move: " + computerMove);

	            if (playerMove.equalsIgnoreCase(computerMove)) {
	                System.out.println("It's a tie!");
	            } 
	            else if (playerMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors") ||
	                       playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock") ||
	                       playerMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")) {
	                playerCount++;
	            	System.out.println("You win!");
	            	System.out.println("player "+ 1 +" point "+" playertotal :"+playerCount);
	                
	            } else {
	            	comCount++;
	                System.out.println("You lose!");
	                System.out.println("computer "+ 1 +" point "+" comtotal :"+comCount);
	            }           
	 }
		  
	}
	 if(comCount>playerCount) {
		 System.out.println("Computer won the match "+"computer Score : "+comCount+" player Score : "+playerCount);
	 }
	 else if(comCount<playerCount) {
		 System.out.println("computer Score : "+comCount+" player Score : "+playerCount+"\nCongratulation you Won this handGame!!!");
	 }
	 else
		 System.out.println("computer Score : "+comCount+" player Score : "+playerCount+"\nGood try!! but both are same points");
	System.out.println("Do you want to play again this game ? \nGive Y or N ");
	choice=sc.next().charAt(0);
	choice=Character.toUpperCase(choice);
	
	
	switch(choice)
	{
	    case 'Y':
	        game();
	        break;
	   case 'N':
	       System.out.println("The End");
	       break;
	   default:
	       System.out.print(" invalid choice...");
	        
	}
	sc.close();
     }
     }
	
	public static void main(String[] args)   {
	 Game g=new Game();
	 g.game();

}
}