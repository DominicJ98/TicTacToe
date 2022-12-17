public class Users {

    private String playerOne;
    private String playerTwo;


    public Users(String playerOne, String playerTwo){
     this.playerOne = playerOne;
     this.playerTwo = playerTwo;
    }




    public String getPlayerOne() {
        return playerOne;
    }
    public String getPlayerTwo() {
        return playerTwo;
    }
    public void setPlayerOne(String playerOne){
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(String playerTwo){
        this.playerTwo = playerTwo;
    }
}
