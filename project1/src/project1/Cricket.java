package project1;

import java.util.Scanner;
import java.util.Random;

public class Cricket {
    int playerInt, comInt, playerScore, comTarget, plTarget, comScore;

    public void bowl(int c, int i) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String f[] = {"Not out", "out"};
        String f1 = f[0];

        while (f1.equals(f[0])) {
            if (c == 0 && i == 1) { // user 1st innings bowling
                System.out.println("bowl the ball");
                playerInt = s.nextInt();
                comInt = r.nextInt(11);
                System.out.println("computer: " + comInt);
                if (playerInt == comInt) {
                    System.out.println("out");
                    f1 = "out";
                    plTarget = comScore + 1;
                    break;
                } else {
                    comScore += comInt;
                    System.out.println("computer score: " + comScore);
                }
            } else if (c == 0 && i == 2) { // user 2nd innings bowling
                System.out.println("bowl the ball");
                playerInt = s.nextInt();
                comInt = r.nextInt(11);
                System.out.println("computer: " + comInt);
                if (comScore > comTarget) {
                    System.out.println("opponent won the match");
                    break;
                }
                if (playerInt == comInt) {
                    System.out.println("out");
                    f1 = "out";
                    if (comScore == playerScore) {
                        System.out.println("match tie!!!");
                    } else {
                        System.out.println("You won the match");
                    }
                    break;
                } else {
                    comScore += comInt;
                    System.out.println("computer score: " + comScore);
                }
            } else if (c == 1 && i == 1) { // com 1st innings
                System.out.print("face the computer ball");
                playerInt = s.nextInt();
                comInt = r.nextInt(11);
                System.out.println("computer: " + comInt);
                if (playerInt == comInt) {
                    System.out.println("you are out");
                    f1 = "out";
                    comTarget = playerScore + 1;
                    break;
                } else {
                    playerScore += playerInt;
                    System.out.println("player score: " + playerScore);
                }
            } else { // com 2nd innings bowl
                System.out.print("face the computer ball");
                comInt = r.nextInt(11);
                System.out.println("computer: " + comInt);
                playerInt = s.nextInt();
                if (playerScore > plTarget) {
                    System.out.println("you won the match");
                    break;
                }
                if (playerInt == comInt) {
                    System.out.println("you are out");
                    f1 = "out";
                    if (playerScore == comScore) {
                        System.out.println("match tie");
                    } else {
                        System.out.println("computer won the match");
                    }
                    break;
                } else {
                    playerScore += playerInt;
                    System.out.println("player score: " + playerScore);
                }
            }
        }
    }

    public void bat(int c, int i) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String f[] = {"Not out", "out"};
        String f1 = f[0];

        while (f1.equals(f[0])) {
            if (c == 0 && i == 1) { // user 1st innings batting
                System.out.println("face the computer ball");
                comInt = r.nextInt(11);
                System.out.println("smash the ball");
                playerInt = s.nextInt();
                System.out.println("computer: " + comInt);
                if (comInt == playerInt) {
                    System.out.println("player out");
                    f1 = "out";
                    comTarget = playerScore + 1;
                    break;
                } else {
                    playerScore += playerInt;
                    System.out.println("player score: " + playerScore);
                }
            } else if (c == 0 && i == 2) { // user 2nd innings batting
                System.out.println("face the computer ball");
                comInt = r.nextInt(11);
                System.out.println("smash the ball");
                playerInt = s.nextInt();
                System.out.println("computer: " + comInt);
                if (playerScore > plTarget) {
                    System.out.println("player won the match");
                    break;
                }
                if (comInt == playerInt) {
                    System.out.println("player out");
                    f1 = "out";
                    if (playerScore == comScore) {
                        System.out.println("draw");
                    } else {
                        System.out.println("player lost the match");
                    }
                    break;
                } else {
                    playerScore += playerInt;
                    System.out.println("player score: " + playerScore);
                }
            } else if (c == 1 && i == 1) { // com 1st innings bowling
                System.out.println("bowl the ball");
                playerInt = s.nextInt();
                comInt = r.nextInt(11);
                System.out.println("computer: " + comInt);
                if (comInt == playerInt) {
                    System.out.println("out");
                    f1 = "out";
                    plTarget = comScore + 1;
                    break;
                } else {
                    comScore += comInt;
                    System.out.println("computer score: " + comScore);
                }
            } else { // com 2nd innings batting
                System.out.println("Bowl the ball");
                playerInt = s.nextInt();
                comInt = r.nextInt(11);
                System.out.println("computer: " + comInt);
                if (comScore > comTarget) {
                    System.out.println("computer won the match");
                    break;
                }
                if (playerInt == comInt) {
                    System.out.println("computer out");
                    f1 = "out";
                    if (comScore == playerScore) {
                        System.out.println("match draw");
                    } else {
                        System.out.println("computer lost the match\n you won the match");
                    }
                    break;
                } else {
                    comScore += comInt;
                    System.out.println("computer score: " + comScore);
                }
            }
        }
    }

    public void handCricket() {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("welcome to handCricket");
        int c, i;
        String toss[] = {"Head", "tail"};
        System.out.println("choose the toss (Head or Tail)");
        String userToss = s.nextLine();
        String flipping = toss[r.nextInt(toss.length)];
        System.out.println(flipping);
        String fun[] = {"Bat", "Bowl"};
        String opDec = "";
        String userDec = "";
        if (userToss.equalsIgnoreCase(flipping)) {
            System.out.println("You won the toss (choose Bat or Bowl)");
            userDec = s.nextLine();
            if (userDec.equalsIgnoreCase(fun[0])) {
                System.out.println("You decided to bat first");
                c = 0;
                i = 1;
                bat(c, i);
                i++;
                bowl(c, i);
            } else {
                System.out.println("You decided to bowl first");
                c = 0;
                i = 1;
                bowl(c, i);
                i++;
                bat(c, i);
            }
        } else {
            System.out.println("Opponent won the toss");
            opDec = fun[r.nextInt(fun.length)];
            if (opDec.equalsIgnoreCase("Bowl")) {
                System.out.println("Opponent won the Toss chose to bowl first");
                c = 1;
                i = 1;
                bowl(c, i);
                i++;
                bat(c, i);
            } else {
                System.out.println("Opponent won the Toss chose to bat first");
                c = 1;
                i = 1;
                bat(c, i);
                i++;
                bowl(c, i);
            }
        }

        s.close();
    }

    public static void main(String[] args) {
        Cricket c = new Cricket();
        c.handCricket();
    }
}
