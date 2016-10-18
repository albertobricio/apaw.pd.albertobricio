package visitor.figure;

public class VisitorNumberOfSides extends Visitor {

	private double numberOfSides;

	@Override
	public void visitCircle(Circle circle) {
		this.numberOfSides = Double.POSITIVE_INFINITY;
		setNumberOfSides(this.numberOfSides);
	}

	@Override
	public void visitSquare(Square square) {
		this.numberOfSides = 4;
		setNumberOfSides(this.numberOfSides);
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.numberOfSides = 3;
		setNumberOfSides(this.numberOfSides);
	}

	public double getNumberOfSides() {
		return this.numberOfSides;
	}

	public void setNumberOfSides(double numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

}
