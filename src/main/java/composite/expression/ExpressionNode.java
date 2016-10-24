package composite.expression;

public abstract class ExpressionNode extends Expression {

	protected Expression expression1;

	protected Expression expression2;

	public ExpressionNode(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

}
