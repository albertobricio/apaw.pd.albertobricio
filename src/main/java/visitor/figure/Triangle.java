package visitor.figure;

public class Triangle extends Figure {
    private double base;

    private double height;

    public Triangle(String description, double base, double height) {
        super(description);
        this.base = base;
        this.height = height;
    }

    public double area() {
        return base * height * 0.5;
    }

    public double numberOfSides() {
        return 3;
    }

    public String toString() {
        return super.toString();
    }

	@Override
	public void accept(Visitor v) {
		v.visitTriangle(this);	
	}

}
