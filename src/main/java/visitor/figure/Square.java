package visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }

    public double getSide()
    {
    	return this.side;
    }

	@Override
	public void accept(Visitor v) {
		v.visitSquare(this);
	}

}
