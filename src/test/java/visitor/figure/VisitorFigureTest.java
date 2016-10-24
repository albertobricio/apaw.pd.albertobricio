package visitor.figure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class VisitorFigureTest {
	
    private List<Figure> listafiguras = new ArrayList<Figure>();

    @Before
    public void ini() {
    	listafiguras.add(new Circle("Circulo",1));
    	listafiguras.add(new Square("Cuadrado",1));
    	listafiguras.add(new Triangle("Triangulo",1, 1)); 
    }

    @Test
    public void testVisitorArea() {
    	VisitorArea v1 = new VisitorArea();
    	List<Double> list = new ArrayList<Double>();
		for (Figure figure : listafiguras) {
			figure.accept(v1);
			list.add(v1.getArea());
		}
		assertEquals(3.141592653589793, list.get(0),0.0001); //Circle
		assertEquals(1.0, list.get(1),0.0001); //Square
		assertEquals(0.5, list.get(2),0.0001); //Triangle
    }

}
