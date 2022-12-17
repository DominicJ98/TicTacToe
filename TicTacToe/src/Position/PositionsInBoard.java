package Position;

public class PositionsInBoard {

    public final Coordinate one = new Coordinate(0, 0);
    public final Coordinate two = new Coordinate(0,1);
    public final Coordinate three = new Coordinate(0,2);
    public final Coordinate four = new Coordinate(1,0);
    public final Coordinate five = new Coordinate(1,1);
    public final Coordinate six = new Coordinate(1,2);
    public final Coordinate seven = new Coordinate(2,0);
    public final Coordinate eight = new Coordinate(2,1);
    public final Coordinate nine = new Coordinate(2,2);


    public PositionsInBoard() {
    }

    public Coordinate getOne() {
        return one;
    }

    public Coordinate getTwo() {
        return two;
    }

    public Coordinate getThree() {
        return three;
    }

    public Coordinate getFour() {
        return four;
    }

    public Coordinate getFive() {
        return five;
    }

    public Coordinate getSix() {
        return six;
    }

    public Coordinate getSeven() {
        return seven;
    }

    public Coordinate getEight() {
        return eight;
    }

    public Coordinate getNine() {
        return nine;
    }
}
