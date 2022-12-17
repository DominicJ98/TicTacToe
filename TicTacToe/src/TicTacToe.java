import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public int count = 0; // keeps track of how many turns are left before the board is full
    Users players;
    public Object[][] ticTable = {
                        {"|","|","|"},
                        {"|","|","|"},
                        {"|","|","|"}
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
            if (ticTable[0][i] == "x"){
                vicSum++;
            } else if (ticTable[0][i] == "o") {
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
        // check second row for victory
        for (int i = 0; i < ticTable[1].length; i++) {
            if (ticTable[1][i] == "x"){
                vicSum++;
            } else if (ticTable[1][i] == "o") {
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
            if (ticTable[2][i] == "x"){
                vicSum++;
            } else if (ticTable[2][i] == "o") {
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
            if (ticTable[i][0] == "x"){
                vicSum++;
            } else if (ticTable[i][0] == "o") {
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
            if (ticTable[i][1] == "x"){
                vicSum++;
            } else if (ticTable[i][1] == "o") {
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
            if (ticTable[i][2] == "x"){
                vicSum++;
            } else if (ticTable[i][2] == "o") {
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
            if (ticTable[i][i] == "x"){
                vicSum++;
            } else if (ticTable[i][i] == "o") {
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


    //method takes in Row, Column, and input ("x" or "o") in that order
    public void tableUpdate(int c, int r, String i){
        if(i != "x" || i != "o"){
            System.out.println("Incorrect Input. Please Try Again!");
        } else if (ticTable[r][c] == "x" || ticTable[r][c] == "o") {
            System.out.println("That spot is already taken. Please Try Again!");
        }else{
            ticTable[r][c] = i;
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
