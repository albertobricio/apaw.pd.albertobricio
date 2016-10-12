package visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double numberOfSides() {
        return 4;
    }

    public String toString() {
        return super.toString();
    }

	@Override
	public void accept(Visitor v) {
		v.visitSquare(this);
	}

}
