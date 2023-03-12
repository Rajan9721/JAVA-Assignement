package guesserGame;

import java.util.Scanner;

class Guesser{
    int guessNum;
    int guessNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser guess a number: ");
        guessNum = sc.nextInt();
        
        return guessNum;
    }
}

class Player{
    int guessNum ;
    public int guessNum1() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Player Enter the Number: ");
        guessNum = sc.nextInt();
        
        return guessNum;
    }

}
class Umpire{
    int numberFromGuesser;
    int numberFromPlayer1;
    int numberFromPlayer2;
    int numberFromPlayer3;

    void collectGuesserNumber(){
        Guesser g = new Guesser();
        numberFromGuesser = g.guessNum();
    }
    void numberFromPlayer() throws Exception{
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numberFromPlayer1 = p1.guessNum1();
        numberFromPlayer2 = p2.guessNum1();
        numberFromPlayer3 = p3.guessNum1();
    
    }

    void compare(){
        if(numberFromGuesser == numberFromPlayer1){
            if(numberFromGuesser == numberFromPlayer2 && numberFromGuesser == numberFromPlayer3){
                System.out.println("All player won the Game");
            }
            else if(numberFromGuesser == numberFromPlayer2){
                System.out.println("Player 1 and 2 won the game");
            }
            else if(numberFromGuesser == numberFromPlayer3){
                System.out.println("Player 1 and 3 won the game");
            }
            else{
                System.out.println("Player 1 won the game");
            }
        }
        else if(numberFromGuesser == numberFromPlayer2){
            if(numberFromGuesser == numberFromPlayer3){
                System.out.println("Player 2 and 3 won the game");
            }
            else{
                System.out.println("Player 2 won the game");
            }
        }
        else if(numberFromGuesser == numberFromPlayer3){
            System.out.println("Player 3 won the game");
        }
        else{
            System.out.println("No any player guess right.");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) throws Exception {


        Umpire u = new Umpire();
        System.out.println("Game Started");
        u.collectGuesserNumber();
        u.numberFromPlayer();
        u.compare();
    }
    
}
