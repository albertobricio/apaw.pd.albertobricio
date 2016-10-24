package visitor.figure;

public class VisitorArea extends Visitor {

	private double area;

	@Override
	public void visitCircle(Circle circle) {
		this.area = Math.PI * circle.getRadius() * circle.getRadius();
		setArea(this.area);
	}

	@Override
	public void visitSquare(Square square) {
		this.area = square.getSide() * square.getSide();
		setArea(this.area);
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.area = triangle.getBase() * triangle.getHeight() * 0.5;
		setArea(this.area);
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
