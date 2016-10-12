package visitor.figure;

public class VisitorToString extends Visitor{

	@Override
	public void visitCircle(Circle circle) {	
	}

	@Override
	public void visitSquare(Square square) {
		square.toString();
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		triangle.toString();
	}

}
