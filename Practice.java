import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hi!\nWould you like to play some game?");
        System.out.println("Choose rock, paper or scissors");
        System.out.println("1 - rock");
        System.out.println("2 - paper");
        System.out.println("3 - scissors");
        int firstPlayer = myScan.nextInt();
        System.out.println("Choose rock, paper or scissors for second player");
        System.out.println("1 - rock");
        System.out.println("2 - paper");
        System.out.println("3 - scissors");
        int secondPlayer = myScan.nextInt();
        String firstCongratulationsMessage = "First player wins\nCongratulations";
        String secondCongratulationsMessage = "Second player wins\nCongratulations!";
        String drawMessage = "Draw";

        if (firstPlayer == 1 && secondPlayer == 1){
            System.out.println(drawMessage);
        }else if (firstPlayer == 1 && secondPlayer == 2){
            System.out.println(secondCongratulationsMessage);
        }else if (firstPlayer == 1 && secondPlayer == 3){
            System.out.println(firstCongratulationsMessage);
        }else if (firstPlayer == 2 && secondPlayer == 1){
            System.out.println(firstCongratulationsMessage);
        }else if (firstPlayer == 2 && secondPlayer == 2){
            System.out.println(drawMessage);
        }else if (firstPlayer == 2 && secondPlayer == 3){
            System.out.println(secondCongratulationsMessage);
        }else if (firstPlayer == 3 && secondPlayer == 1){
            System.out.println(secondCongratulationsMessage);
        }else if (firstPlayer == 3 && secondPlayer == 2){
            System.out.println(firstCongratulationsMessage);
        }else if (firstPlayer ==3 && secondPlayer == 3){
            System.out.println(drawMessage);
        }else System.out.println("Error !!!");
        System.out.println("Thanks for the game!\nSee u soon\nBye)");



    }
}
