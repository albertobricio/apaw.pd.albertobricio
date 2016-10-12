package visitor.figure;

public class VisitorArea extends Visitor{

	@Override
	public void visitCircle(Circle circle) {
		circle.area();
	}

	@Override
	public void visitSquare(Square square) {
		square.area();
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		triangle.area();	
	}

}
