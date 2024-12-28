package com.games;

import java.util.Random;

public class Game {
    private int comCount = 0;
    private int playerCount = 0;
    private final int max = 10; // Set the maximum score limit
    
    public String playRound(String playerMove) {
        if (comCount == max || playerCount == max) {
            return "Game over! " + getFinalResult();
        }

        String[] moves = {"Rock", "Paper", "Scissors"};
        Random r = new Random();
        String computerMove = moves[r.nextInt(moves.length)];
        
        String result = "Computer move: " + computerMove + "\n";

        if (playerMove.equalsIgnoreCase(computerMove)) {
            result += "It's a tie!";
        } else if ((playerMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) ||
                   (playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) ||
                   (playerMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper"))) {
            playerCount++;
            result += "You win! Your score: " + playerCount;
        } else {
            comCount++;
            result += "You lose! Computer score: " + comCount;
        }
        
        // Check if the game has reached the maximum score after this round
        if (comCount == max || playerCount == max) {
            result += "\n" + getFinalResult();
        }

        return result;
    }

    public String getFinalResult() {
        if (comCount > playerCount) {
            return "Computer won the match. Final score - Computer: " + comCount + ", You: " + playerCount;
        } else if (comCount < playerCount) {
            return "Congratulations! You won the match. Final score - You: " + playerCount + ", Computer: " + comCount;
        } else {
            return "It's a tie! Final score - You: " + playerCount + ", Computer: " + comCount;
        }
    }
    
    public int getPlayerScore() {
        return playerCount;
    }

    public int getComputerScore() {
        return comCount;
    }
    
    public boolean isGameOver() {
        return playerCount == max || comCount == max;
    }
}

