package calculadoraConDeshacer;

public abstract class OrderOperations implements Order {

	protected Calculator calculator;

	public OrderOperations(Calculator calculator) {
		this.calculator = calculator;
	}

}
