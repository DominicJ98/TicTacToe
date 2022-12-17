import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Users users = new Users();

        System.out.println("Please enter User 1: ");
        String playerOne = scanner.nextLine();

        while(playerOne.length() == 0){
            System.out.println("Blank name is incorrect! " + "Please enter a valid name");
            playerOne = scanner.nextLine();
        }


        System.out.println("Please enter User 2: ");
        String playerTwo = scanner.nextLine();
        while(playerTwo.length() == 0 ){
            System.out.println("Blank name is incorrect! " + "Please enter a valid name");
            playerTwo = scanner.nextLine();
        }

        users.setPlayerTwo(playerTwo);
        users.setPlayerOne(playerOne);

        TicTacToe game = new TicTacToe(users);


        while(!game.checkVictory()){
            game.printTable();

        }


    }
}
