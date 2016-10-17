package calculadoraConDeshacer;

public class GetTotalOrder extends OrderOperations{

	public GetTotalOrder(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Total";
	}

	@Override
	public void execute() {
		System.out.println("Total:"+this.calculator.getTotal());
	}

}
