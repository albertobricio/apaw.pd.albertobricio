package visitor.figure;

public class VisitorNumberOfSides extends Visitor{

	@Override
	public void visitCircle(Circle circle) {
		circle.numberOfSides();
	}

	@Override
	public void visitSquare(Square square) {
		square.numberOfSides();
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		triangle.numberOfSides();	
	}

}
