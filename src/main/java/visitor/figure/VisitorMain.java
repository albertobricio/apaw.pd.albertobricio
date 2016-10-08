package visitor.figure;

import java.util.ArrayList;
import java.util.Collection;

public final class VisitorMain {
	
	private Collection<Figure> coleccion = new ArrayList<Figure>();
	
	public VisitorMain() {
		coleccion.add(new ElementA());
		coleccion.add(new ElementA());
		coleccion.add(new ElementB());
		coleccion.add(new ElementA());
	}

}
