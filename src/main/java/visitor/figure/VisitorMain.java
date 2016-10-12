package visitor.figure;

import java.util.ArrayList;
import java.util.Collection;

public class VisitorMain {

	private Collection<Figure> coleccion = new ArrayList<Figure>();

	public VisitorMain() {
		coleccion.add(new Circle("Circulo",1));
		coleccion.add(new Square("Cuadrado",1));
		coleccion.add(new Triangle("Circulo",1, 1));
	}

	public void visitador1() {
		VisitorArea v1 = new VisitorArea();
		for (Figure figure : coleccion) {
			figure.accept(v1);
		}
	}

}
