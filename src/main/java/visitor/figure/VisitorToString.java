package visitor.figure;

public class VisitorToString extends Visitor {

	private String description;

	@Override
	public void visitCircle(Circle circle) {
		this.description = circle.getDescription();
		setDescription(this.description);
	}

	@Override
	public void visitSquare(Square square) {
		this.description = square.getDescription();
		setDescription(this.description);
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.description = triangle.getDescription();
		setDescription(this.description);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
