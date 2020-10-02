import java.util.*;

class rockPaperScissor 
{
    
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public static void main(String args[]) 
    {
      System.out.println("Enter any one of the following inputs:  ");
      System.out.println("ROCK");
      System.out.println("PAPER");
      System.out.println("SCISSORS");
      System.out.println();
          
      String playerMove = getPlayerMove();
      String computerMove = getComputerMove(); 
 
      
      if (playerMove.equals(computerMove))
        System.out.println("Game is Tie !!");
         
      else if (playerMove.equals(rockPaperScissor.ROCK))
        System.out.println(computerMove.equals(rockPaperScissor.PAPER) ? "Computer Wins" : "Player wins");   
      
      else if (playerMove.equals(rockPaperScissor.PAPER))
        System.out.println(computerMove.equals(rockPaperScissor.SCISSORS) ? "Computer Wins" : "Player wins");   
       
      else
        System.out.println(computerMove.equals(rockPaperScissor.ROCK) ? "Computer Wins" : "Player wins");   

    }
    
    // fun for computer move 
    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        
        int input = random.nextInt(3)+1;
        
        if (input == 1)
            computermove = rockPaperScissor.ROCK;
            
        else if(input == 2)
            computermove = rockPaperScissor.PAPER;
            
        else
            computermove = rockPaperScissor.SCISSORS;
            
        System.out.println("Computer move is: " + computermove);
        System.out.println();
        
        return computermove;    
    }
    
    // fun for player move
    public static String getPlayerMove()
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        String playermove = input.toUpperCase();
        System.out.println("Player move is: "+ playermove);
        sc.close();
        return playermove;
        
    }    
}
