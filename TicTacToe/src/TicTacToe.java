import Position.Coordinate;
import Position.PositionsInBoard;
import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public int count = 0; // keeps track of how many turns are left before the board is full
    Users players;
    public Object[][] ticTable = {
                        {"__1_","_2_","_3__"},
                        {"__4_","_5_","_6__"},
                        {"__7_","_8_","_9__"}
                            };
    TicTacToe(Users players){
        this.players = players;
    }

    // checks for victory should only be used if counter is at least 4
    public boolean checkVictory(){
        int vicSum = 0; // running total that determines win
        int columnIndex = 0; // keeps track of column

        // checks the first row for victory
        for (int i = 0; i < ticTable[0].length; i++) {
            if (ticTable[0][i].equals("__x_")
                ||ticTable[0][i].equals("_x_")
                ||ticTable[0][i].equals("_x__")
            ){
                vicSum++;
            } else if (ticTable[0][i].equals("__o_")
                ||ticTable[0][i].equals("_o_")
                ||ticTable[0][i].equals("_o__")
            ) {
                vicSum += 2;
            }

            if (vicSum == 3){
                System.out.println("X Wins!");
                return true;
            }else if(vicSum == 6){
                System.out.println("O Wins!");
                return true;
            }
        }

        vicSum = 0; // zeros the countrunning count
        // check second row for victory
        for (int i = 0; i < ticTable[1].length; i++) {
            if (ticTable[1][i].equals("__x_")
                ||ticTable[1][i].equals("_x_")
                ||ticTable[1][i].equals("_x__")
            ){
                vicSum++;
            } else if (ticTable[1][i].equals("__o_")
                ||ticTable[1][i].equals("_o_")
                ||ticTable[1][i].equals("_o__")
            ) {
                vicSum += 2;
            }
            if (vicSum == 3){
                System.out.println("X Wins!");
                return true;
            }else if(vicSum == 6){
                System.out.println("O Wins!");
                return true;
            }
        }

        vicSum = 0; // zeros the running count
        //checks 3rd row for victory
        for (int i = 0; i < ticTable[2].length; i++) {
            if (ticTable[2][i].equals("__x_")
                ||ticTable[2][i].equals("_x_")
                ||ticTable[2][i].equals("_x__")
            ){
                vicSum++;
            } else if (ticTable[2][i].equals("__o_")
                || ticTable[2][i].equals("_o_")
                || ticTable[2][i].equals("_o__")
            ) {
                vicSum += 2;
            }
            if (vicSum == 3){
                System.out.println("X Wins!");
                return true;
            }else if(vicSum == 6){
                System.out.println("O Wins!");
                return true;
            }
        }

        vicSum = 0; // zeros running count
        // checks 1st column for victory columnIndex is 0
        for (int i = 0; i < ticTable.length; i++) {
            if (ticTable[i][0].equals("__x_")
                || ticTable[i][0].equals("_x_")
                || ticTable[i][0].equals("_x__")
            ){
                vicSum++;
            } else if (ticTable[i][0].equals("__o_")
                || ticTable[i][0].equals("_o_")
                || ticTable[i][0].equals("_o__")
            ) {
                vicSum += 2;
            }
            if (vicSum == 3){
                System.out.println("X Wins!");
                return true;
            }else if(vicSum == 6){
                System.out.println("O Wins!");
                return true;
            }
        }

        vicSum = 0; // zeros running count
        // checks 2nd column for victory coulumn Index is 1
        for (int i = 0; i < ticTable.length; i++) {
            if (ticTable[i][1].equals("__x_")
                || ticTable[i][1].equals("_x_")
                || ticTable[i][1].equals("_x__")
            ){
                vicSum++;
            } else if (ticTable[i][1].equals("__o_")
                ||ticTable[i][1].equals("_o_")
                ||ticTable[i][1].equals("_o__")
            ) {
                vicSum += 2;
            }
            if (vicSum == 3){
                System.out.println("X Wins!");
                return true;
            }else if(vicSum == 6){
                System.out.println("O Wins!");
                return true;
            }
        }

        vicSum = 0; // zeros running count
        // checks 3nd column for victory coulumn Index is 2
        for (int i = 0; i < ticTable.length; i++) {
            if (ticTable[i][2].equals("__x_")
                ||ticTable[i][2].equals("_x_")
                ||ticTable[i][2].equals("_x__")
            ){
                vicSum++;
            } else if (ticTable[i][2].equals("__o_")
                ||ticTable[i][2].equals("_o_")
                ||ticTable[i][2].equals("_o__")
            ) {
                vicSum += 2;
            }
            if (vicSum == 3){
                System.out.println("X Wins!");
                return true;
            }else if(vicSum == 6){
                System.out.println("O Wins!");
                return true;
            }
        }

        vicSum = 0; // zeros running count
        // checks the diagonal for victory
        for (int i = 0; i < ticTable.length; i++) {
            if (ticTable[i][i].equals("__x_")
                ||ticTable[i][i].equals("_x_")
                ||ticTable[i][i].equals("_x__")
            ){
                vicSum++;
            } else if (ticTable[i][i].equals("__o_")
                ||ticTable[i][i].equals("_o_")
                ||ticTable[i][i].equals("_o__")
            ) {
                vicSum += 2;
            }

            if (vicSum == 3){
                System.out.println("X Wins!");
                return true;
            }else if(vicSum == 6){
                System.out.println("O Wins!");
                return true;
            }

        }

        vicSum = 0; // zeros running count
        // checks the other diagonal for victory
        for (int i = 0; i < ticTable.length; i++) {
            if (ticTable[i][ticTable.length - i - 1] == "x"){
                vicSum++;
            } else if (ticTable[i][ticTable.length - i - 1] == "o") {
                vicSum += 2;
            }
            if (vicSum == 3){
                System.out.println("X Wins!");
                return true;
            }else if(vicSum == 6){
                System.out.println("O Wins!");
                return true;
            }
        }
        return false;
    }

    PositionsInBoard positions = new PositionsInBoard();
    //method takes in Row, Column, and input ("x" or "o") in that order
    public void tableUpdate(Coordinate coordinate, String i){
        if(ticTable[coordinate.getRow()][coordinate.getColumn()] == "__x_"
                || ticTable[coordinate.getRow()][coordinate.getColumn()] == "__o_"
                || ticTable[coordinate.getRow()][coordinate.getColumn()] == "_x_"
                || ticTable[coordinate.getRow()][coordinate.getColumn()] == "_x__"
                || ticTable[coordinate.getRow()][coordinate.getColumn()] == "_0__"
                || ticTable[coordinate.getRow()][coordinate.getColumn()] == "_0_"
        ) {
            System.out.println("That spot is already taken. Please Try Again!");
        }else if(coordinate.equals(positions.getOne())
                || coordinate.equals(positions.getFour())
                || coordinate.equals(positions.getSeven())){
            ticTable[coordinate.getRow()][coordinate.getColumn()] = "__" + i +"_";
            count++;
        }else if(coordinate.equals(positions.getTwo())
                || coordinate.equals(positions.getFive())
                || coordinate.equals(positions.getEight()) ){
            ticTable[coordinate.getRow()][coordinate.getColumn()] = "_" + i +"_";
            count++;
        }else if(coordinate.equals(positions.getThree())
                || coordinate.equals(positions.getSix())
                || coordinate.equals(positions.getNine())){
            ticTable[coordinate.getRow()][coordinate.getColumn()] = "_" + i +"__";
            count++;
        }
    }

    // prints current table
    public void printTable() {
        for (int i = 0; i < ticTable.length; i++) {
            for (int j = 0; j < ticTable[i].length; j++) {
                System.out.print(ticTable[i][j]);
            }
            System.out.println();
        }
    }
    //input to an empty tictactoe board


    //after 4 inputs start checking board for wins until you reach 9 inputs it is a tie
    
}
