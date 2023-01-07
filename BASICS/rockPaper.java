package BASICS;

import java.util.Scanner;

public class rockPaper {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] choices = { "rock", "paper", "scissors" };

    System.out.println("Enter your choice");

    String userChoice = sc.nextLine();

    int computerIndex = (int) (Math.random() * 3);
    String computerChoice = choices[computerIndex];

    // compare the choices and determine the winner
    
    if(userChoice.equals(computerChoice)) {
      System.out.println("It's a tie!");
    }
    
    else if ((userChoice.equals("rock")) && (computerChoice.equals("scissors"))){
      System.out.println("You win!!");
    }

    else if((userChoice.equals("paper")) && (computerChoice.equals("rock"))){
      System.out.println("You win!");
    }

    else if((userChoice.equals("scissors")) && (computerChoice.equals("paper"))){
      System.out.println("You win!");
    }
    else{
      System.out.println("Computer win");
    }

    
    // if (userChoice.equals(computerChoice)) {
    //   System.out.println("Its a tie");
    // } else if (userChoice.equals("rock")) {
    //   if (computerChoice.equals("scissors")) {
    //     System.out.println("You win");
    //   } else {
    //     System.out.println("Computer wins!");
    //   }
    // } else if (userChoice.equals("paper")) {
    //   if (computerChoice.equals("rock")) {
    //     System.out.println("You win");
    //   } else {
    //     System.out.println("Comouter wins");
    //   }
    // } else if (userChoice.equals("scissors")) {
    //   if (computerChoice.equals("paper")) {
    //     System.out.println("You win!");
    //   } else {
    //     System.out.println("Computer wins!");
    //   }

    // }

    // if (userChoice.equals(computerChoice)){
    //   System.out.println("It's a tie!");

    // }
    
    
    sc.close();
  }
}
