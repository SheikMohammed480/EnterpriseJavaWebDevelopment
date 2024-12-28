package com.games;

import java.util.Random;

public class Game3 {
    private int playerInt, comInt, playerScore, comTarget, plTarget, comScore;
    private String lastOutcome;
    private boolean gameOver = false;
    private String tossResult;
    private String turn = "player"; // Tracks whose turn it is
    private String gameMode;

    public String getTossResult(String userToss) {
        Random r = new Random();
        String toss[] = {"Head", "Tail"};
        String flipResult = toss[r.nextInt(toss.length)];
        
        tossResult = flipResult.equalsIgnoreCase(userToss) ? "won" : "lost";
        return "Toss result: " + flipResult + ". You " + tossResult + " the toss.";
    }

    public void initializeGame(String userDecision) {
        gameMode = userDecision.equalsIgnoreCase("Bat") ? "bat" : "bowl";
        playerScore = comScore = 0;
        lastOutcome = "Game started. You chose to " + gameMode + " first.";
    }

    public String playTurn(int userChoice) {
        if (gameOver) return "Game over! " + getFinalResult();

        Random r = new Random();
        comInt = r.nextInt(11);

        // Decide action based on the current game state
        if (turn.equals("player") && gameMode.equals("bat")) {
            playerInt = userChoice;
            if (playerInt == comInt) {
                lastOutcome = "You got out! Computer's turn to bat.";
                comTarget = playerScore + 1;
                gameMode = "bowl";
            } else {
                playerScore += playerInt;
                lastOutcome = "You scored " + playerInt + ". Total: " + playerScore;
            }
        } else if (turn.equals("computer") && gameMode.equals("bowl")) {
            comInt = r.nextInt(11);
            if (playerInt == comInt) {
                lastOutcome = "Computer got out! Your turn to bowl.";
                plTarget = comScore + 1;
                gameMode = "bat";
            } else {
                comScore += comInt;
                lastOutcome = "Computer scored " + comInt + ". Total: " + comScore;
            }
        }

        // Check if the game has ended
        checkGameOver();
        return lastOutcome;
    }

    private void checkGameOver() {
        if (playerScore >= comTarget || comScore >= plTarget) {
            gameOver = true;
            lastOutcome = getFinalResult();
        }
    }

    public String getFinalResult() {
        if (playerScore > comScore) return "Congratulations! You won the match.";
        else if (playerScore < comScore) return "Computer won the match!";
        else return "It's a tie!";
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return comScore;
    }

    public boolean isGameOver() {
        return gameOver;
    }
}
