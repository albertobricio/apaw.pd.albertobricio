package visitor.figure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class Visitor2Test {
    private Collection<Figure> coleccion = new ArrayList<Figure>();

    @Before
    public void ini() {
    	coleccion.add(new Circle("Circulo",1));
		coleccion.add(new Square("Cuadrado",1));
		coleccion.add(new Triangle("Circulo",1, 1));
    }

    @Test
    public void testVisitorArea() {
    	VisitorArea visitorArea = new VisitorArea();
		for (Figure figure : coleccion) {
			figure.accept(visitorArea);
		}
		for (Figure figure : coleccion) {
			assertEquals(2, visitorArea.visitCircle(figure));
		}
		
    }

    @Test
    public void testVisitorNumberOfSides() {
        Visitor2 v2 = new Visitor2();
        for (Element elemento : coleccion) {
            elemento.accept(v2);
        }
        assertEquals(2, v2.getBs());
    }
    
    @Test
    public void testVisitorToString() {
        Visitor2 v2 = new Visitor2();
        for (Element elemento : coleccion) {
            elemento.accept(v2);
        }
        assertEquals(2, v2.getBs());
    }

}
