import Position.PositionsInBoard;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        PositionsInBoard positions = new PositionsInBoard();

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

        System.out.println();
        game.printTable();
        System.out.println();
        System.out.println("Player one will be X and Player two will be O");

        while(game.count < 4){
            System.out.println("Player one, please enter a position 1 - 9, for your marker X");
            String position = scanner.nextLine();

            switch(position){
                case "1": game.tableUpdate(positions.getOne(), "x");
                case "2":game.tableUpdate(positions.getTwo(), "x");
                case "3":game.tableUpdate(positions.getThree(), "x");
                case "4":game.tableUpdate(positions.getFour(), "x");
                case "5":game.tableUpdate(positions.getFive(), "x");
                case "6":game.tableUpdate(positions.getSix(), "x");
                case "7":game.tableUpdate(positions.getSeven(), "x");
                case "8":game.tableUpdate(positions.getEight(), "x");
                case "9":game.tableUpdate(positions.getNine(), "x");
            }

            game.printTable();
            System.out.println("Player two, please enter a position 1 - 9, for your marker O");
            String position2 = scanner.nextLine();
            switch(position2){
                case "1": game.tableUpdate(positions.getOne(), "o");
                case "2":game.tableUpdate(positions.getTwo(), "o");
                case "3":game.tableUpdate(positions.getThree(), "o");
                case "4":game.tableUpdate(positions.getFour(), "o");
                case "5":game.tableUpdate(positions.getFive(), "o");
                case "6":game.tableUpdate(positions.getSix(), "o");
                case "7":game.tableUpdate(positions.getSeven(), "o");
                case "8":game.tableUpdate(positions.getEight(), "o");
                case "9":game.tableUpdate(positions.getNine(), "o");
            }
        }

    }
}
