package composite.expression;

public class Multiplicacion extends ExpressionNode {

	public Multiplicacion(Expression expresion1, Expression expresion2) {
		super(expresion1, expresion2);
	}

	@Override
	public int operar() {
		return expression1.operar() * expression2.operar();
	}

	@Override
	public String toString() {
		return "(" + expression1.toString() + "*" + expression2.toString() + ")";
	}

}
