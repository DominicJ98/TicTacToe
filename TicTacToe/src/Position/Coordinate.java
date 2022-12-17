package Position;

public class Coordinate {
    int row;
    int column;


    public Coordinate(int x, int y){
        this.row = x;
        this.column = y;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
